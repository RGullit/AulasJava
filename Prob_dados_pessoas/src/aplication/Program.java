package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tallPerson = 0;
		double smallPerson = 0;
		double womansAverageHeight = 0;
		int mans = 0;
		int womans = 0;
		
		System.out.println("Enter the number of persons that you want to register.");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for(int i =0; i < vect.length ; i++) {
			
			System.out.printf("Enter the height of the %d person. \n", i + 1);
			double height = sc.nextDouble();
			System.out.printf("Enter the gender of the %d person. (m/f) \n", i + 1);
			char gender = sc.next().charAt(0);
			
			vect[i] = new Person(gender, height);
			
			if(height < smallPerson) {
				smallPerson = height;
			} else if (height > tallPerson) {
				tallPerson = height;
			}
			
			if(gender == 'm') {
				mans++;
			} else {
				womans++;
				womansAverageHeight += height;
			}
		}
		
		womansAverageHeight = womansAverageHeight / womans;
		
		System.out.println("Smaller person height: " + smallPerson);
		System.out.println("Taller person height: " + tallPerson);
		System.out.println("Womans average height: " + womansAverageHeight);
		System.out.println("Total of mans: " + mans);

		sc.close();
	}

}
