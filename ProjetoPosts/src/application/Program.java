package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post
				(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zeland!", 
				"I'm going to visit this wonderful country", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good Night!");
		Comment c4 = new Comment("Thats beautiful!");
		
		Post p2 = new Post
				(sdf.parse("22/06/2018 16:12:31"), 
				"Good Night!", 
				"See you tomorow", 
				6);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);

	}
	
	
}
