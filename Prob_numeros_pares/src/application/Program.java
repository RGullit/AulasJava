package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int oddNumbers = 0;
		String msg = "";

		System.out.println("How many numbers will you insert? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Enter a number: ");
			vect[i] = sc.nextInt();

			if ((vect[i] % 2) == 0) {
				oddNumbers++;
				msg += vect[i] + " ";
			}
		}
		
		System.out.println("Odd numbers: ");
		System.out.println(msg);
		System.out.println("Odd numbers quantity: " + oddNumbers);

		sc.close();
	}

}
