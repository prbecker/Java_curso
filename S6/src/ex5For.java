import java.util.Scanner;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por defini��o, fatorial de 0 � 1.
public class ex5For 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N, i, fat = 1;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for (i = N; i >= 0; i--) 
		{
			
			if(i == 0)
			{
				fat *= 1;
			}
			else
			{
				fat *= i;
			}
		}
		System.out.println(fat);

		sc.close();
	}
}
