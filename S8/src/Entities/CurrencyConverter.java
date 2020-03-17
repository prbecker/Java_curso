package Entities;

public class CurrencyConverter 
{
	public static double iof = 0.06;
	
	public static double AmountToBePaid(double dollarPrice, double dollars)
	{
		double amount = dollarPrice * (dollars + (dollars * iof));
		return amount;		
	}
}
