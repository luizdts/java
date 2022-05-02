package entities;

public class CurrencyConverter {
	
	public double dollar;
	public double value;
	
	public double converter() {
		double iof = 0.06;
		
		return value * (dollar + (dollar * iof));
	}
}
