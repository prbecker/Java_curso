import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
public class ex2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x, resto;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		resto = x % 2;
		if(resto == 0)
		{
			System.out.println("PAR");
		}
		else
		{
			System.out.println("IMPAR");
		}
		
		sc.close();
	}
}
