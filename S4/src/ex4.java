import java.util.Scanner;
import java.util.Locale;

//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio 
//desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais. 

public class ex4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number;
		int horas;
		double valor;
		double salary;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		number = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
				
		salary = horas * valor;
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salary);
				
		sc.close();
	}
}
