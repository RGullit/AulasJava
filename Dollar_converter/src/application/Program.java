package application;

import java.util.Locale;
import java.util.Scanner;

import converter.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println("what is the dollar price?");
		double dol = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double qtt = sc.nextDouble();
		
		double value = cc.dollarConverter(qtt, dol);
		
		System.out.println("Amount to be paid in real: " + value);
		
		
		
		sc.close();

	}

}
