package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double deposit;
		double withdraw;
		Account account;

		System.out.println("Enter account number: ");
		int accNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Is there a initial deposit value? y/n");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y') {
			System.out.println("Enter initial deposit value:");
			deposit = sc.nextDouble();
			account = new Account(accNumber,holder,deposit);
		} else {
		account = new Account(accNumber, holder);
		}
		
		System.out.println();
		System.out.println(account.toString());
		System.out.println();
		System.out.println("Enter a deposit value: ");
		deposit = sc.nextDouble();
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account.toString());

		sc.close();
	}

}
