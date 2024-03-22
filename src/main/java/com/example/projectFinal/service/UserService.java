package com.example.projectFinal.service;

import com.example.projectFinal.dto.UserDto;
import com.example.projectFinal.entity.User;
import com.example.projectFinal.jwt.TokenProvider;
import com.example.projectFinal.repository.UserRepository;
import io.jsonwebtoken.ExpiredJwtException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserService {
    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final TokenProvider tokenProvider;

    @Autowired
    public UserService(UserRepository userRepository, TokenProvider tokenProvider, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.tokenProvider = tokenProvider;
    }

    public ResponseEntity<User> SignUp(UserDto.RegisterDto registerDto) {
        try {
            User user = new User();
            user.setUserId(registerDto.getUserId());
            String encryptPw = bCryptPasswordEncoder.encode(registerDto.getPassword());
            user.setPassword(encryptPw);
            user.setEmail(registerDto.getEmail());
            user.setNickname(registerDto.getNickname());
            User result = userRepository.save(user);
            System.out.println("회원가입 결과: " + result);
            return ResponseEntity.ok(result);
        } catch (Exception e) {

            log.error("Signup error", e);

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    public UserDto.LoginResDto Login(UserDto.LoginDto loginDto){
        Optional<User> SelectId = userRepository.findById(loginDto.getUserId());
        UserDto.LoginResDto result = new UserDto.LoginResDto();
        if(SelectId.isPresent()){
            User user = SelectId.get();
//            비밀번호 일치 여부 확인
            boolean comparePW = bCryptPasswordEncoder.matches(loginDto.getPassword(), user.getPassword());

//          비밀번호 일치 하지 않을 경우 리턴
            if(!comparePW){
                result.setResult(false);
                result.setMsg("비밀번호가 일치하지 않습니다");
                return result;
            }

            UserDto.TokenDto tokenDto = tokenProvider.generateToken(loginDto.getUserId());
            System.out.println("액세스 토큰 확인" + tokenDto.getAccessToken());

            userRepository.updateRefreshToken(loginDto.getUserId(), tokenDto.getRefreshToken());
            result.setResult(true);
            result.setAccessToken(tokenDto.getAccessToken());
            result.setRefreshToken(tokenDto.getRefreshToken());
            return result;
        } else{
            result.setResult(false);
            result.setMsg("아이디가 존재하지 않습니다.");
            return result;
        }
    }

    public boolean Logout(String token) {
//        try{
            System.out.println(token);
            UserDto.ResDto loginUser = tokenProvider.validateAndGetUserId(token);
            System.out.println("토큰 유효 여부 확인" + loginUser);

            userRepository.RefreshTokenToNull(loginUser.getMsg());

            return true;
    }

    public UserDto.AuthuserDto authuser(String accessToken, String RefreshToken){
        UserDto.AuthuserDto authuserDto = new UserDto.AuthuserDto();

        // 액세스 토큰 유효 검증
        UserDto.ResDto result = tokenProvider.validateAndGetUserId(accessToken);
        System.out.println("액세스 토큰 확인" + result.isResult() + result.getMsg());
        if(result.isResult()){
            System.out.println("토큰 유효");
            authuserDto.setResult(result.isResult());
            authuserDto.setNickname(result.getMsg());
            return authuserDto;
        }

        UserDto.ResDto result1 = tokenProvider.validateAndGetUserId(RefreshToken);
        if(!result.isResult() && !result1.isResult()){
            authuserDto.setResult(result1.isResult());
            return authuserDto;
        }

        User Userinfo = this.userRepository.findNicknameFromToken(RefreshToken);

        authuserDto.setResult(result1.isResult());
        authuserDto.setNickname(Userinfo.getNickname());
        authuserDto.setUserId(Userinfo.getUserId());

        UserDto.TokenDto tokenDto = tokenProvider.generateToken(authuserDto.getUserId());

        authuserDto.setNewToken(tokenDto.getAccessToken());

        System.out.println("리프레시 토큰 인증 후 response" + authuserDto);

        return authuserDto;

    }

    public boolean CheckDupId(String UserId){
        return this.userRepository.existsByUserId(UserId);

    }

    public boolean CheckDupNick(String Nickname){
        return this.userRepository.existsByNickname(Nickname);
    }

}
