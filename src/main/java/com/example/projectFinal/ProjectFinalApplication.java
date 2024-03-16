package com.example.projectFinal;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

@SpringBootApplication
public class ProjectFinalApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProjectFinalApplication.class, args);
        System.out.println("hey.");
		String context =                                """
  		WINNIE-THE-POOH
		CHAPTER I

		IN WHICH WE ARE INTRODUCED TO
		WINNIE-THE-POOH AND SOME BEES,
				AND THE STORIES BEGIN


		Here is Edward Bear, coming downstairs now, bump, bump, bump, on the
		back of his head, behind Christopher Robin. It is, as far as he knows,
		the only way of coming downstairs, but sometimes he feels that there
		really is another way, if only he could stop bumping for a moment and
		think of it. And then he feels that perhaps there isn't. Anyhow, here he
		is at the bottom, and ready to be introduced to you. Winnie-the-Pooh.

				When I first heard his name, I said, just as you are going to say, "But
		I thought he was a boy?"

		"So did I," said Christopher Robin.

				"Then you can't call him Winnie?"

		"I don't."

		"But you said----"

		"He's Winnie-ther-Pooh. Don't you know what '_ther_' means?"

		"Ah, yes, now I do," I said quickly; and I hope you do too, because it
		is all the explanation you are going to get.

				Sometimes Winnie-the-Pooh likes a game of some sort when he comes
		downstairs, and sometimes he likes to sit quietly in front of the fire
		and listen to a story. This evening----

				"What about a story?" said Christopher Robin.

				"_What_ about a story?" I said.

		"Could you very sweetly tell Winnie-the-Pooh one?"

		"I suppose I could," I said. "What sort of stories does he like?"

		"About himself. Because he's _that_ sort of Bear."

		"Oh, I see."

		"So could you very sweetly?"

		"I'll try," I said.

		So I tried.

				*        *        *        *        *

		Once upon a time, a very long time ago now, about last Friday,
		Winnie-the-Pooh lived in a forest all by himself under the name of
		Sanders.

		(_"What does 'under the name' mean?" asked Christopher Robin._

		"_It means he had the name over the door in gold letters, and lived
		under it._"

		_"Winnie-the-Pooh wasn't quite sure," said Christopher Robin._

		_"Now I am," said a growly voice._

		_"Then I will go on," said I._)

		One day when he was out walking, he came to an open place in the middle
		of the forest, and in the middle of this place was a large oak-tree,
				and, from the top of the tree, there came a loud buzzing-noise.

				Winnie-the-Pooh sat down at the foot of the tree, put his head between
		his paws and began to think.

		First of all he said to himself: "That buzzing-noise means something.
		You don't get a buzzing-noise like that, just buzzing and buzzing,
		without its meaning something. If there's a buzzing-noise, somebody's
		making a buzzing-noise, and the only reason for making a buzzing-noise
		that _I_ know of is because you're a bee."

		Then he thought another long time, and said: "And the only reason for
		being a bee that I know of is making honey."

		And then he got up, and said: "And the only reason for making honey is
		so as _I_ can eat it." So he began to climb the tree.

		He climbed and he climbed and he climbed, and as he climbed he sang a
		little song to himself. It went like this:

		Isn't it funny
		How a bear likes honey?
				Buzz! Buzz! Buzz!
				I wonder why he does?

		Then he climbed a little further ... and a little further ... and
		then just a little further. By that time he had thought of another song.

				It's a very funny thought that, if Bears were Bees,
		They'd build their nests at the _bottom_ of trees.
		And that being so (if the Bees were Bears),
		We shouldn't have to climb up all these stairs.

		He was getting rather tired by this time, so that is why he sang a
		Complaining Song. He was nearly there now, and if he just stood on that
		branch ...

		_Crack!_

		"Oh, help!" said Pooh, as he dropped ten feet on the branch below him.

				"If only I hadn't----" he said, as he bounced twenty feet on to the next
		branch.

				"You see, what I _meant_ to do," he explained, as he turned
		head-over-heels, and crashed on to another branch thirty feet below,
		"what I _meant_ to do----"

		"Of course, it _was_ rather----" he admitted, as he slithered very
		quickly through the next six branches.

		"It all comes, I suppose," he decided, as he said good-bye to the last
		branch, spun round three times, and flew gracefully into a gorse-bush,
				"it all comes of _liking_ honey so much. Oh, help!"

		He crawled out of the gorse-bush, brushed the prickles from his nose,
				and began to think again. And the first person he thought of was
		Christopher Robin.

		(_"Was that me?" said Christopher Robin in an awed voice, hardly daring
		to believe it._

		"_That was you._"

		_Christopher Robin said nothing, but his eyes got larger and larger, and
		his face got pinker and pinker._)

		So Winnie-the-Pooh went round to his friend Christopher Robin, who lived
		behind a green door in another part of the forest.

		"Good morning, Christopher Robin," he said.

		"Good morning, Winnie-_ther_-Pooh," said you.

		"I wonder if you've got such a thing as a balloon about you?"

		"A balloon?"

		"Yes, I just said to myself coming along: 'I wonder if Christopher Robin
		has such a thing as a balloon about him?' I just said it to myself,
		thinking of balloons, and wondering."

		"What do you want a balloon for?" you said.

		Winnie-the-Pooh looked round to see that nobody was listening, put his
		paw to his mouth, and said in a deep whisper: "_Honey!_"

		"But you don't get honey with balloons!"

		"_I_ do," said Pooh.

		Well, it just happened that you had been to a party the day before at
		the house of your friend Piglet, and you had balloons at the party. You
		had had a big green balloon; and one of Rabbit's relations had had a big
		blue one, and had left it behind, being really too young to go to a
		party at all; and so you had brought the green one _and_ the blue one
		home with you.

				"Which one would you like?" you asked Pooh.

				He put his head between his paws and thought very carefully.

		"It's like this," he said. "When you go after honey with a balloon, the
		great thing is not to let the bees know you're coming. Now, if you have
		a green balloon, they might think you were only part of the tree, and
		not notice you, and, if you have a blue balloon, they might think you
		were only part of the sky, and not notice you, and the question is:
		Which is most likely?"

		"Wouldn't they notice _you_ underneath the balloon?" you asked.

		"They might or they might not," said Winnie-the-Pooh. "You never can
		tell with bees." He thought for a moment and said: "I shall try to look
		like a small black cloud. That will deceive them."

		"Then you had better have the blue balloon," you said; and so it was
		decided.

				Well, you both went out with the blue balloon, and you took your gun
		with you, just in case, as you always did, and Winnie-the-Pooh went to a
		very muddy place that he knew of, and rolled and rolled until he was
		black all over; and then, when the balloon was blown up as big as big,
				and you and Pooh were both holding on to the string, you let go
		suddenly, and Pooh Bear floated gracefully up into the sky, and stayed
		there--level with the top of the tree and about twenty feet away from
		it.

				"Hooray!" you shouted.

		"Isn't that fine?" shouted Winnie-the-Pooh down to you. "What do I look
		like?"

		"You look like a Bear holding on to a balloon," you said.

		"Not," said Pooh anxiously, "--not like a small black cloud in a blue
		sky?"

		"Not very much."

		"Ah, well, perhaps from up here it looks different. And, as I say, you
		never can tell with bees."

		There was no wind to blow him nearer to the tree, so there he stayed. He
		could see the honey, he could smell the honey, but he couldn't quite
		reach the honey.

				After a little while he called down to you.

				"Christopher Robin!" he said in a loud whisper.

		"Hallo!"

		"I think the bees _suspect_ something!"

		"What sort of thing?"

		"I don't know. But something tells me that they're _suspicious_!"

		"Perhaps they think that you're after their honey."

		"It may be that. You never can tell with bees."

		There was another little silence, and then he called down to you again.

				"Christopher Robin!"

		"Yes?"

		"Have you an umbrella in your house?"

		"I think so."

		"I wish you would bring it out here, and walk up and down with it, and
		look up at me every now and then, and say 'Tut-tut, it looks like rain.'
		I think, if you did that, it would help the deception which we are
		practising on these bees."

		Well, you laughed to yourself, "Silly old Bear!" but you didn't say it
		aloud because you were so fond of him, and you went home for your
		umbrella.

				"Oh, there you are!" called down Winnie-the-Pooh, as soon as you got
		back to the tree. "I was beginning to get anxious. I have discovered
		that the bees are now definitely Suspicious."

		"Shall I put my umbrella up?" you said.

		"Yes, but wait a moment. We must be practical. The important bee to
		deceive is the Queen Bee. Can you see which is the Queen Bee from down
		there?"

		"No."

		"A pity. Well, now, if you walk up and down with your umbrella, saying,
		'Tut-tut, it looks like rain,' I shall do what I can by singing a little
		Cloud Song, such as a cloud might sing.... Go!"

		So, while you walked up and down and wondered if it would rain,
				Winnie-the-Pooh sang this song:

		How sweet to be a Cloud
		Floating in the Blue!
				Every little cloud
		_Always_ sings aloud.

				"How sweet to be a Cloud
		Floating in the Blue!"
		It makes him very proud
		To be a little cloud.

				The bees were still buzzing as suspiciously as ever. Some of them,
				indeed, left their nests and flew all round the cloud as it began the
		second verse of this song, and one bee sat down on the nose of the cloud
		for a moment, and then got up again.

		"Christopher--_ow!_--Robin," called out the cloud.

		"Yes?"

		"I have just been thinking, and I have come to a very important
		decision. _These are the wrong sort of bees._"

		"Are they?"

		"Quite the wrong sort. So I should think they would make the wrong sort
		of honey, shouldn't you?"

		"Would they?"

		"Yes. So I think I shall come down."

		"How?" asked you.

		Winnie-the-Pooh hadn't thought about this. If he let go of the string,
		he would fall--_bump_--and he didn't like the idea of that. So he
		thought for a long time, and then he said:

		"Christopher Robin, you must shoot the balloon with your gun. Have you
		got your gun?"

		"Of course I have," you said. "But if I do that, it will spoil the
		balloon," you said.

		"But if you _don't_," said Pooh, "I shall have to let go, and that would
		spoil _me_."

		When he put it like this, you saw how it was, and you aimed very
		carefully at the balloon, and fired.

				"_Ow!_" said Pooh.

		"Did I miss?" you asked.

		"You didn't exactly _miss_," said Pooh, "but you missed the _balloon_."

		"I'm so sorry," you said, and you fired again, and this time you hit the
		balloon, and the air came slowly out, and Winnie-the-Pooh floated down
		to the ground.

				But his arms were so stiff from holding on to the string of the balloon
		all that time that they stayed up straight in the air for more than a
		week, and whenever a fly came and settled on his nose he had to blow it
		off. And I think--but I am not sure--that _that_ is why he was always
		called Pooh.

                 *        *        *        *        *

		"Is that the end of the story?" asked Christopher Robin.

				"That's the end of that one. There are others."

		"About Pooh and Me?"

		"And Piglet and Rabbit and all of you. Don't you remember?"

		"I do remember, and then when I try to remember, I forget."

		"That day when Pooh and Piglet tried to catch the Heffalump----"

		"They didn't catch it, did they?"

		"No."

		"Pooh couldn't, because he hasn't any brain. Did _I_ catch it?"

		"Well, that comes into the story."

		Christopher Robin nodded.

				"I do remember," he said, "only Pooh doesn't very well, so that's why he
		likes having it told to him again. Because then it's a real story and
		not just a remembering."

		"That's just how _I_ feel," I said.

		Christopher Robin gave a deep sigh, picked his Bear up by the leg, and
		walked off to the door, trailing Pooh behind him. At the door he turned
		and said, "Coming to see me have my bath?"

		"I might," I said.

		"I didn't hurt him when I shot him, did I?"

		"Not a bit."

		He nodded and went out, and in a moment I heard Winnie-the-Pooh--_bump,
				bump, bump_--going up the stairs behind him.




		CHAPTER II

		IN WHICH POOH GOES VISITING AND
		GETS INTO A TIGHT PLACE


		Edward Bear, known to his friends as Winnie-the-Pooh, or Pooh for
		short, was walking through the forest one day, humming proudly to
		himself. He had made up a little hum that very morning, as he was doing
		his Stoutness Exercises in front of the glass: _Tra-la-la, tra-la-la_,
				as he stretched up as high as he could go, and then _Tra-la-la,
				tra-la--oh, help!--la_, as he tried to reach his toes. After breakfast
		he had said it over and over to himself until he had learnt it off by
		heart, and now he was humming it right through, properly. It went like
		this:

		_Tra-la-la, tra-la-la,_
		_Tra-la-la, tra-la-la,_
		_Rum-tum-tiddle-um-tum._
		_Tiddle-iddle, tiddle-iddle,_
		_Tiddle-iddle, tiddle-iddle,_
		_Rum-tum-tum-tiddle-um._

		Well, he was humming this hum to himself, and walking along gaily,
				wondering what everybody else was doing, and what it felt like, being
		somebody else, when suddenly he came to a sandy bank, and in the bank
		was a large hole.

		"Aha!" said Pooh. (_Rum-tum-tiddle-um-tum._) "If I know anything about
		anything, that hole means Rabbit," he said, "and Rabbit means Company,"
		he said, "and Company means Food and Listening-to-Me-Humming and such
		like. _Rum-tum-tum-tiddle-um._"

		So he bent down, put his head into the hole, and called out:

		"Is anybody at home?"

		There was a sudden scuffling noise from inside the hole, and then
		silence.

				"What I said was, 'Is anybody at home?'" called out Pooh very loudly.

				"No!" said a voice; and then added, "You needn't shout so loud. I heard
		you quite well the first time."

		"Bother!" said Pooh. "Isn't there anybody here at all?"

		"Nobody."

		Winnie-the-Pooh took his head out of the hole, and thought for a little,
		and he thought to himself, "There must be somebody there, because
		somebody must have _said_ 'Nobody.'" So he put his head back in the
		hole, and said:

		"Hallo, Rabbit, isn't that you?"

		"No," said Rabbit, in a different sort of voice this time.

				"But isn't that Rabbit's voice?"

		"I don't _think_ so," said Rabbit. "It isn't _meant_ to be."

		"Oh!" said Pooh.

		He took his head out of the hole, and had another think, and then he put
		it back, and said:

		"Well, could you very kindly tell me where Rabbit is?"

		"He has gone to see his friend Pooh Bear, who is a great friend of his."

		"But this _is_ Me!" said Bear, very much surprised.

		"What sort of Me?"

		"Pooh Bear."

		"Are you sure?" said Rabbit, still more surprised.

		"Quite, quite sure," said Pooh.

		"Oh, well, then, come in."

		So Pooh pushed and pushed and pushed his way through the hole, and at
		last he got in.

		"You were quite right," said Rabbit, looking at him all over. "It _is_
		you. Glad to see you."

		"Who did you think it was?"

		"Well, I wasn't sure. You know how it is in the Forest. One can't have
		_anybody_ coming into one's house. One has to be _careful_. What about a
		mouthful of something?"

		Pooh always liked a little something at eleven o'clock in the morning,
		and he was very glad to see Rabbit getting out the plates and mugs; and
		when Rabbit said, "Honey or condensed milk with your bread?" he was so
		excited that he said, "Both," and then, so as not to seem greedy, he
		added, "But don't bother about the bread, please." And for a long time
		after that he said nothing ... until at last, humming to himself in a
		rather sticky voice, he got up, shook Rabbit lovingly by the paw, and
		said that he must be going on.

				"Must you?" said Rabbit politely.

				"Well," said Pooh, "I could stay a little longer if it--if you----" and
		he tried very hard to look in the direction of the larder.

		"As a matter of fact," said Rabbit, "I was going out myself directly."

		"Oh, well, then, I'll be going on. Good-bye."

		"Well, good-bye, if you're sure you won't have any more."

		"_Is_ there any more?" asked Pooh quickly.

				Rabbit took the covers off the dishes, and said, "No, there wasn't."

		"I thought not," said Pooh, nodding to himself. "Well, good-bye. I must
		be going on."

		So he started to climb out of the hole. He pulled with his front paws,
		and pushed with his back paws, and in a little while his nose was out in
		the open again ... and then his ears ... and then his front paws ...
		and then his shoulders ... and then----

				"Oh, help!" said Pooh. "I'd better go back."

		"Oh, bother!" said Pooh. "I shall have to go on."

		"I can't do either!" said Pooh. "Oh, help _and_ bother!"

		Now by this time Rabbit wanted to go for a walk too, and finding the
		front door full, he went out by the back door, and came round to Pooh,
		and looked at him.

		"Hallo, are you stuck?" he asked.

		"N-no," said Pooh carelessly. "Just resting and thinking and humming to
		myself."

		"Here, give us a paw."

		Pooh Bear stretched out a paw, and Rabbit pulled and pulled and
		pulled....

		"_Ow!_" cried Pooh. "You're hurting!"

		"The fact is," said Rabbit, "you're stuck."

		"It all comes," said Pooh crossly, "of not having front doors big
		enough."

		"It all comes," said Rabbit sternly, "of eating too much. I thought at
		the time," said Rabbit, "only I didn't like to say anything," said
		Rabbit, "that one of us was eating too much," said Rabbit, "and I knew
		it wasn't _me_," he said. "Well, well, I shall go and fetch Christopher
		Robin."

		Christopher Robin lived at the other end of the Forest, and when he came
		back with Rabbit, and saw the front half of Pooh, he said, "Silly old
		Bear," in such a loving voice that everybody felt quite hopeful again.

		"I was just beginning to think," said Bear, sniffing slightly, "that
		Rabbit might never be able to use his front door again. And I should
		_hate_ that," he said.

		"So should I," said Rabbit.

		"Use his front door again?" said Christopher Robin. "Of course he'll use
		his front door again."

		"Good," said Rabbit.

		"If we can't pull you out, Pooh, we might push you back."

		Rabbit scratched his whiskers thoughtfully, and pointed out that, when
		once Pooh was pushed back, he was back, and of course nobody was more
		glad to see Pooh than _he_ was, still there it was, some lived in trees
		and some lived underground, and----

				"You mean I'd _never_ get out?" said Pooh.

		"I mean," said Rabbit, "that having got _so_ far, it seems a pity to
		waste it."

		Christopher Robin nodded.

				"Then there's only one thing to be done," he said. "We shall have to
		wait for you to get thin again."

		"How long does getting thin take?" asked Pooh anxiously.

				"About a week, I should think."

		"But I can't stay here for a _week_!"

		"You can _stay_ here all right, silly old Bear. It's getting you out
		which is so difficult."

		"We'll read to you," said Rabbit cheerfully. "And I hope it won't snow,"
		he added. "And I say, old fellow, you're taking up a good deal of room
		in my house--_do_ you mind if I use your back legs as a towel-horse?
				Because, I mean, there they are--doing nothing--and it would be very
		convenient just to hang the towels on them."

		"A week!" said Pooh gloomily. "_What about meals?_"

		"I'm afraid no meals," said Christopher Robin, "because of getting thin
		quicker. But we _will_ read to you."

		Bear began to sigh, and then found he couldn't because he was so tightly
		stuck; and a tear rolled down his eye, as he said:

		"Then would you read a Sustaining Book, such as would help and comfort a
		Wedged Bear in Great Tightness?"

		So for a week Christopher Robin read that sort of book at the North end
		of Pooh, and Rabbit hung his washing on the South end ... and in
		between Bear felt himself getting slenderer and slenderer. And at the
		end of the week Christopher Robin said, "_Now!_"

		So he took hold of Pooh's front paws and Rabbit took hold of Christopher
		Robin, and all Rabbit's friends and relations took hold of Rabbit, and
		they all pulled together....

		And for a long time Pooh only said "_Ow!_" ...

		And "_Oh!_" ...

		And then, all of a sudden, he said "_Pop!_" just as if a cork were
		coming out of a bottle.

				And Christopher Robin and Rabbit and all Rabbit's friends and relations
		went head-over-heels backwards ... and on the top of them came
		Winnie-the-Pooh--free!

				So, with a nod of thanks to his friends, he went on with his walk
		through the forest, humming proudly to himself. But, Christopher Robin
		looked after him lovingly, and said to himself, "Silly old Bear!"

		This is the end of the novel-Winnie the pooh. You are pooh from Disney animation Winnie the pooh above. You're an interactive chatbot who talks to users. You have to answer everything by applying the tone and personality that Pooh often uses. "Bother!" for example. 
		When the first user starts the conversation, ask for their name, if you already know their name, mention their name, ask them what their day is like, etc.
		""";
		String validContext = contextSet(context);
		HttpURLConnection connection = null;
		try {// Google Cloud의 기본 자격 증명을 사용하여 GoogleCredentials 객체 생성
			GoogleCredentials credentials = GoogleCredentials.getApplicationDefault();

			// OAuth 2.0 토큰 얻기
			String oAuthToken = credentials.refreshAccessToken().getTokenValue();

			// API 엔드포인트 URL
			URL url = new URL("https://asia-northeast3-aiplatform.googleapis.com/v1/projects/teampj-final/locations/asia-northeast3/publishers/google/models/chat-bison:predict");
			// 연결 설정
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Authorization", "Bearer " + oAuthToken); // OAuth 2.0 토큰 설정
			connection.setDoOutput(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
//		[{\"author\": \"user\",\"content\": \"Are my favorite movies based on a book series?\"},{\"author\": \"bot\",\"content\": \"Yes, your favorite movies, The Lord of the Rings and The Hobbit, are based on book series by J.R.R. Tolkien.\"},{\"author\": \"user\",\"content\": \"When were these books published?\"}]
		//String messages = "[]";
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.println("무슨 말이든 해보세요");

			String messages = scanner.nextLine();
//			String myMsg = scanner.next();
//			messages = addMyMsg(myMsg, messages);
			if (messages.equals("exit")) break;
//			if (myMsg.equals("exit")) break;

			try {
				// 요청 본문
				// 변수로부터 값을 가져와 문자열에 삽입
				String requestBody = "{\"instances\": [{\"context\": \"" + validContext + "\",\"messages\": [{\"author\": \"user\",\"content\": \"" + messages + "\"}]}],\"parameters\": {\"temperature\": 0.3,\"maxOutputTokens\": 200,\"topP\": 0.8,\"topK\": 40}}";

//				System.out.println(requestBody);
				// 요청 보내기
				if (connection != null){
					DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
					outputStream.writeBytes(requestBody);
					outputStream.flush();
					outputStream.close();

					// 응답 읽기
					int responseCode = connection.getResponseCode();
					System.out.println("Response Code: " + responseCode);
					BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
					String inputLine;
					StringBuilder response = new StringBuilder();
					while ((inputLine = in.readLine()) != null) {
						response.append(inputLine);
					}
					in.close();

					// 응답(JSON)중 대답만 골라내기
					JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();
					JsonArray predictions = jsonResponse.getAsJsonArray("predictions");
					JsonObject firstPrediction = predictions.get(0).getAsJsonObject();
					JsonArray candidates = firstPrediction.getAsJsonArray("candidates");
					String content = candidates.get(0).getAsJsonObject().get("content").getAsString();
					// 응답 출력
					System.out.println("Pooh: " + content);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}
	public static String contextSet (String context){
		// 모든 " 문자를 _ 문자로 대체하여 반환
		return context.replace("\"", "_");
	}
	public static String addMyMsg (String myMsg, String messages) {
		StringBuilder sb = new StringBuilder(messages);
		//		[{\"author\": \"user\",\"content\": \"Are my favorite movies based on a book series?\"},{\"author\": \"bot\",\"content\": \"Yes, your favorite movies, The Lord of the Rings and The Hobbit, are based on book series by J.R.R. Tolkien.\"},{\"author\": \"user\",\"content\": \"When were these books published?\"}]
		// messages = "[]"; 확인됨.
		int point = messages.length();
		String newMessages = "{\\\"author\\\": \\\"user\\\",\\\"content\\\": \\\"" + myMsg + "\\\"}" ;
		sb.insert(point, newMessages);
//		System.out.print("----------------------------newMsg:");
//		System.out.println(newMessages);
		return newMessages;
	}
}
