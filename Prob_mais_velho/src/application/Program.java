package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many people will you enter? ");
		int n = sc.nextInt();
		String older = "";
		int age = 0;
		
		String[] names = new String[n];
		int[] ages = new int[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Enter the name of the %d person. \n", i+1);
			names[i] = sc.nextLine();
			System.out.printf("Enter the age of the %d person. \n", i+1);
			ages[i] = sc.nextInt();
			
			if(ages[i] > age) {
				age = ages[i];
				older = names[i];
			}
		}
		
		System.out.println("Older person: " + older);

		
		sc.close();
	}

}
