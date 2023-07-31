package application;

import java.util.Locale;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many values your vectors will have? ");
		int n = sc.nextInt();
		int[] vect1 = new int[n];
		int[] vect2 = new int[n];
		int[] sumVects = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the %d value for the first vector: \n", i +1);
			vect1[i] = sc.nextInt();
			System.out.printf("Enter the %d value for the second vector: \n", i +1 );
			vect2[i] = sc.nextInt();
			sumVects[i] = vect1[i] + vect2[i];
		}

		System.out.println("Result Vector: ");

		for (int i = 0; i < sumVects.length; i++) {
			System.out.println(sumVects[i]);
		}

		sc.close();
	}

}
