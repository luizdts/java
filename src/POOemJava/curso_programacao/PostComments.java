package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Comment;
import model.entities.Post;

public class PostComments {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(sdf.parse("10/06/2022 12:45:23"),
				"Traveling to New Zeland",
				"I'm going to visit this wonderful country!",
				215);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		Comment c3 = new Comment("Good Night.");
		Comment c4 = new Comment("May the Force with you!");
		Post p2 = new Post(sdf.parse("12/06/2022 02:45:23"),
				"Good night guys",
				"See you tomorrow",
				7);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
	}

}
