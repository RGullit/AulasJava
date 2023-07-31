package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double med = 0;

		System.out.println("How many elements your vector will have? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.println("Enter a number: ");
			vect[i] = sc.nextDouble();
			med += vect[i];
		}
		med = med / vect.length;
		
		System.out.printf("Vector's average: %.3f \n", med);
		System.out.println("Elements bellow average:");

		for (int i = 0; i < vect.length; i++) {
			
			if(vect[i] < med) {
				System.out.println(vect[i] + "\n");
			}
		}
		
		sc.close();
	}

}
