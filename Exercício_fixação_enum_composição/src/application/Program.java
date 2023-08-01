package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter the client data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Birth Date(DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);

		System.out.println();
		System.out.println("Enter the order data: ");
		System.out.println("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		System.out.println("How many items to this order: ");
		int qtt = sc.nextInt();
		LocalDate date = LocalDate.now();
		Order order = new Order(date, OrderStatus.valueOf(status),client);

		for (int i = 0; i < qtt; i++) {
			
			System.out.println("Enter #" + i+1 +" item data: " );
			System.out.println("Product name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.println("Product price: ");
			double prodPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int prodQtt = sc.nextInt();
			Product product = new Product(prodName, prodPrice);
			OrderItem orderItem = new OrderItem(prodQtt, prodPrice, product);
			order.addItem(orderItem);
		}
		
		System.out.println(order.toString());

		sc.close();
	}

}
