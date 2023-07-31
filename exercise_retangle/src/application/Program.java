package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		
		System.out.println("Enter the rectangle width: ");
		retangle.width = sc.nextDouble();
		System.out.println();
		
		System.out.println("Enter the rectangle height: ");
		retangle.height = sc.nextDouble();
		System.out.println();
		
		System.out.println("Area: " + retangle.area());
		
		System.out.println("Area: " + retangle.perimeter());
		
		System.out.println("Area: " + retangle.diagonal());

		
		sc.close();
	}

}
