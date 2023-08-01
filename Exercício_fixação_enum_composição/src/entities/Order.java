package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private LocalDate moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItems = new ArrayList<>();

	public Order() {}

	public Order(LocalDate moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem orderItem) {
		this.orderItems.add(orderItem);
	}
	
	public void removeItem(OrderItem orderItem) {
		this.orderItems.remove(orderItem);
	}
	
	public double total() {
		double sum = 0;
		for (OrderItem item : this.orderItems) {
			sum+= item.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Sumary: \n");
		sb.append("Order moment: " + this.moment + "\n");
		sb.append("Order status: " + this.status.toString() + "\n");
		sb.append("Client: " + this.client.getName() + " " + this.client.getBirthDate() + " - " + this.client.getEmail()+ "\n");
		sb.append("Order Items: \n");
		for (OrderItem item : this.orderItems) {
			sb.append(item.toString() + "\n");
		}
		sb.append("Total price: $" +String.format("%.2f", this.total()));
		return sb.toString();
	}
}
