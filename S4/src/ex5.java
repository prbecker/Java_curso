import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número 
//de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
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
