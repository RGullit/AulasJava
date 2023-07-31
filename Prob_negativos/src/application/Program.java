package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers will you provide?");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Enter the %d number: ", i+1);
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("NUMBERS: " + vect);


		sc.close();
	}

}
