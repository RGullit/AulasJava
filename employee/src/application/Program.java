package application;

import java.util.Locale;
import java.util.Scanner;

import RH.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter the name of the employee: ");
		employee.name = sc.nextLine();
		
		System.out.println("Enter his gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Enter his taxes: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
		
		System.out.println("Witch percentage to increase salary?");
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee.name + ", $" + employee.netSalary());
		
		sc.close();
	}

}
