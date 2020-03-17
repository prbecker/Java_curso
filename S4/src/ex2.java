import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais
public class ex2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double x;
		double area;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextDouble();
		
		area = Math.pow(x, 2) * 3.14159;
		System.out.printf("A=%.4f", area);
		
		sc.close();
	}
}
