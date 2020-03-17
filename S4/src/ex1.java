import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
public class ex1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x;
		int y;
		int soma;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();	
		
		soma = x + y;
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
