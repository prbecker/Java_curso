import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto 
//de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). 
public class ex3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int A;
		int B;
		int C;
		int D;
		int dif;
				
		Scanner sc = new Scanner(System.in);
				
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
				
		dif = (A*B) - (C*D);
		System.out.println("DIFERENCA = " + dif);
				
		sc.close();
	}
}
