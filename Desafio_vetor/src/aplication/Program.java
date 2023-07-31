package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rent[] vect = new Rent[9];

		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		int[] rented = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the data for rent # %d:\n", i + 1);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			rented[i] = room;
			vect[room] = new Rent(name, email, room);
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < rented.length; i++) {
			 System.out.println(vect[rented[i]].toString());
		}

		sc.close();
	}

}
