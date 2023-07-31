package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students will you enter? ");
		int n = sc.nextInt();
		
		Student[] vect = new Student[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.printf("Enter the name of %d student:", i +1);
			String nome = sc.nextLine();
			System.out.printf("Enter the %d score of  student:", i +1);
			double nota1 = sc.nextDouble();
			System.out.printf("Enter the %d score of student:", i +1);
			double nota2 = sc.nextDouble();
			
			vect[i] = new Student(nome,nota1,nota2);
		}
		
		System.out.println("Aproved students: ");
		
		for(int i=0; i<vect.length; i++) {
			
			if(vect[i].isAproved() == true) {
				System.out.println(vect[i].getNome());
			}

		}

		
		sc.close();
	}

}
