package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String msg = "NUMBERS: ";
		double sum = 0;

		System.out.println("How many numbers will you provide?");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Enter the %d number: ", i+1);
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		for (int i = 0; i < vect.length; i++) {
			msg += " " + vect[i];
		}
		
		System.out.println(msg);
		System.out.println("SUM: " + sum);
		System.out.println("AVERAGE: " + sum/vect.length);


		


		sc.close();
	}

}
