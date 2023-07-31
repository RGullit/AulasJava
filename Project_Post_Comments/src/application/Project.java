package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comments;
import entities.Post;

public class Project {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comments c1 = new Comments("Have a nice trip!");
		Comments c2 = new Comments("Uau thats awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to new Zealand", "I'm going to visit this wonderfull country", 12);
		
		p1.addComments(c1);
		p1.addComments(c2);
		
		System.out.println(p1);
		
	}

}
