import java.util.Locale;
import java.util.Scanner;

//Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa. Em seguida, calcule e mostre o valor que esta pessoa deve 
//pagar de Imposto de Renda.
public class ex8 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double salary, total, parcial;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		salary = sc.nextDouble();
		
		if((salary >= 0.00) && (salary <= 2000.00))
		{
			System.out.println("Isento");
		}
		else if((salary > 2000.00) && (salary <= 3000.00))
		{
			parcial = salary - 2000.00;
			total = (parcial * 8) / 100;
			System.out.printf("R$ %.2f", total);
		}
		else if((salary > 3000.00) && (salary <= 4500.00))
		{
			parcial = salary - 3000.00;
			total = (1000.00 * 8) / 100;
			total = total + ((parcial * 18) / 100);
			System.out.printf("R$ %.2f", total);
		}
		else if(salary > 4500.00)
		{
			parcial = salary - 4500.00;
			total = (1000.00 * 8) / 100;
			total = total + ((1500 * 18) / 100);
			total = total + ((parcial * 28) / 100);
			System.out.printf("R$ %.2f", total);
		}
		
		sc.close();
	}
}
