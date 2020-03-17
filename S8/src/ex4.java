import java.util.Locale;
import java.util.Scanner;
import Entities.CurrencyConverter;

public class ex4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		double dollarPrice;
		double dollars;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	

		System.out.println("What is the dollar price?");
		dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		dollars = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.AmountToBePaid(dollarPrice, dollars));
		
		sc.close();
	}
}
