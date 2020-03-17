package Application;

import java.util.Scanner;

public class ex3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int m, n, valor;
		
		Scanner sc = new Scanner(System.in);	

		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
				
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				matriz[i][j] = sc.nextInt();
			}
		}
		valor = sc.nextInt();
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(matriz[i][j] == valor)
				{
					System.out.printf("Position %d,%d:%n", i, j);
					if(j > 0)
					{
						System.out.printf("Left: %d%n", matriz[i][j-1]);
					}
					if(j < n-1)
					{
						System.out.printf("Right: %d%n", matriz[i][j+1]);
					}
					if(i > 0)
					{
						System.out.printf("Up: %d%n", matriz[i-1][j]);
					}
					if(i < m-1)
					{
						System.out.printf("Down: %d%n", matriz[i+1][j]);
					}
				}
			}
		}
					
		sc.close();
	}
}
