import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero 
//de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago
public class ex5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int cod1, cod2;
		int number1, number2;
		double valor1, valor2;
		double total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		cod1 = sc.nextInt();
		number1 = sc.nextInt();
		valor1 = sc.nextDouble();
		cod2 = sc.nextInt();
		number2 = sc.nextInt();
		valor2 = sc.nextDouble();
				
		total = (number1 * valor1) + (number2 * valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
				
		sc.close();
	}
}
