import java.util.Locale;
import java.util.Scanner;

//Escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar
public class ex5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int cod, quantidade;
		double valor;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		cod = sc.nextInt();
		quantidade = sc.nextInt();
		
		if(cod == 1)
		{
			valor = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f", valor);
		}
		else if(cod == 2)
		{
			valor = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f", valor);
		}
		else if(cod == 3)
		{
			valor = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f", valor);
		}
		else if(cod == 4)
		{
			valor = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f", valor);
		}
		else
		{
			valor = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f", valor);
		}
		
		sc.close();
	}
}
