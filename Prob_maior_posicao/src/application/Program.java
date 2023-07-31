package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double higherN = 0;
		int position = 0;
		
		System.out.println("How many numbers will you enter?");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i<vect.length; i++) {
			System.out.println("Enter a number: ");
			vect[i] = sc.nextDouble();
			
			if (vect[i] > higherN) {
				higherN = vect[i];
				position = i;
			}
			
		}
		
		System.out.println("Higher number: " + higherN);
		System.out.println("Higher number position: " + position);
		
		sc.close();
	}

}
