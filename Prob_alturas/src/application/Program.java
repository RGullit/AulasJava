package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int young = 0;
		String youngPeople = "";
		double averageheight = 0;
		
		System.out.println("How many persons will you provide? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.printf("Enter the data of the %d ª person \n", i+1);
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Age: ");
			int age = sc.nextInt();
			System.out.println("Height: ");
			double height = sc.nextDouble();
			vect[i] = new Person(name,age,height);
			
			if(age < 16) {
				young++;
				youngPeople += name + ", ";
			}
			
			averageheight += height;
			
			
		}
		
		double percentage = ((double)young / vect.length) * 100;
		System.out.printf("Average height: %.2f \n", averageheight / vect.length);
		System.out.println("People under 16 years: " + percentage);
		System.out.println(youngPeople);
		
		sc.close();
	}

}
