import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o
public class ex1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
				
		if(x >= 0)
		{
			System.out.println("NAO NEGATIVO");
		}
		else
		{
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}
}
