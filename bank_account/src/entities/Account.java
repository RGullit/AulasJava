package entities;

public class Account {
	private int accNumber;
	private String holder;
	private double value;
	private static final double WITHDRAW_TAX = 5.00;
	
	public Account() {
	}
	
	public Account(int accNumber, String name, double value) {
		this.accNumber = accNumber;
		this.holder = name;
		deposit(value);
	}
	
	public Account(int accNumber, String name) {
		this.accNumber = accNumber;
		this.holder = name;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getName() {
		return holder;
	}

	public void setName(String name) {
		this.holder = name;
	}

	public double getValue() {
		return value;
	}

	public void deposit(double depValue) {
		this.value += depValue;
	}	
	
	public void withdraw(double withdraw) {
		this.value -= withdraw + WITHDRAW_TAX;
	}
	
	public String toString() {
		String msg = "Account " + accNumber + ", Holder " + holder + ", Balance " + String.format("%.2f",value) ;
		return msg;
	}

}
