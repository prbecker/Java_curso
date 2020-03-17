import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos"
public class ex3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int A, B, resto;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A > B)
		{
			resto = A % B;
			if(resto == 0)
			{
				System.out.println("Sao Multiplos");
			}
			else
			{
				System.out.println("Nao sao Multiplos");
			}
		}
		else if(B > A)
		{
			resto = B % A;
			if(resto == 0)
			{
				System.out.println("Sao Multiplos");
			}
			else
			{
				System.out.println("Nao sao Multiplos");
			}
		}
		else
		{
			System.out.println("Sao Multiplos");
		}
		
		sc.close();
	}
}
