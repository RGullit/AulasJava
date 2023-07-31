package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of the triangle X: ");
		x.a = sc.nextFloat();
		x.b= sc.nextFloat();
		x.c = sc.nextFloat();
		
		System.out.println("Enter the measures of the triangle Y: ");
		y.a = sc.nextFloat();
		y.b = sc.nextFloat();
		y.c = sc.nextFloat();
		
		x.area = x.calcArea();
		y.area = y.calcArea();
		
		System.out.println("Triangle X area is " + x.area);
		System.out.println("Triangle Y area is " + y.area);
		
		if(x.area > y.area) {
			System.out.println("The triangle with higher area is X");
		} else {
		System.out.println("The triangle with higher area is Y");

		}	
		
		sc.close();
	}

}
