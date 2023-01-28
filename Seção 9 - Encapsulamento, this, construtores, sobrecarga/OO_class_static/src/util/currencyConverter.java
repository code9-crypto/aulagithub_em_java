package util;

public class currencyConverter {
	
	public static final double IOF = 0.06; 
	
	public static double converter(double priceDollar, double amountDollar) {
		
		double total =  (amountDollar * priceDollar);
		return (total * IOF) + total;
		
	}
	
}
