package entities;

public class Employee {
	
	private String name;
	private Double salary;
	private Integer id;
	
	
	public Employee(String name, double salary, int id) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public int getId() {
		return id;
	}

	public void raiseSalary(double percentage) {
		double raise = (salary / 100) * percentage;	
		salary += raise;
		
	}
	
	public String toString() {
		String msg;
		msg = id + ", " + name + ", " + String.format("%.2f", salary);
		return msg;
	}

}
