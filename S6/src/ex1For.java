import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o X, se for o caso.
public class ex1For 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int X, i;
		
		Scanner sc = new Scanner(System.in);
		
		X = sc.nextInt();
		
		for (i = 0; i <= X; i++) 
		{
			if ((i % 2) != 0) 
			{
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
