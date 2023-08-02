package entities;

public class SavingsAccount extends Account{
	
	private Double interestRating;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, double balance, Double interestRating) {
		super(number, holder, balance);
		this.interestRating = interestRating;
	}

	public Double getInterestRating() {
		return interestRating;
	}

	public void setInterestRating(Double interestRating) {
		this.interestRating = interestRating;
	}
	
	
	public void updateBalance() {
		balance += balance * interestRating;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
