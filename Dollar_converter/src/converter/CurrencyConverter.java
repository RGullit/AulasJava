package converter;

public class CurrencyConverter {
	
	public double dollarConverter(double qntt, double dollar) {	
		double value = (dollar * qntt);
		double iof = (value /100) * 6;
		value = value + iof;
		return value;
	}

}
