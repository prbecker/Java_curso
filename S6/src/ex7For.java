import java.util.Scanner;

//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.
public class ex7For 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N, i, quadrado, cubo;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for (i = 1; i <= N; i++) 
		{
			
			quadrado = i * i;
			cubo = i * i * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}

		sc.close();
	}
}
