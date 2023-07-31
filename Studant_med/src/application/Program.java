package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Studant;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Studant student = new Studant();
		System.out.println("Enter the student data: ");
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("First trimester grade: ");
		student.a1 = sc.nextDouble();
		System.out.println("Secont trimester grade: ");
		student.a2 = sc.nextDouble();
		System.out.println("Third trimester grade: ");
		student.a3 = sc.nextDouble();
		student.calcMedia();
		student.showResults();
		
		sc.close();
	}

}
