package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int oddNum = 0;
		int oddNumCounter = 0;

		System.out.println("How many elements your vector will have? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Enter a number: ");
			vect[i] = sc.nextInt();

			if (vect[i] % 2 == 0) {
				oddNum += vect[i];
				oddNumCounter++;
			}

		}
				
		if (oddNumCounter == 0) {
			System.out.println("No odd numbers!");
		} else {
			double oddAverage = oddNum / oddNumCounter;
			System.out.printf("Odd numbers average: %.1f", oddAverage);
		}

	}

}
