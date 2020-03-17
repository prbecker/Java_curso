import java.util.Locale;
import java.util.Scanner;

//Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos 
//([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em nenhum destes intervalos, dever� 
//ser impressa a mensagem �Fora de intervalo�.
public class ex6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double number;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		number = sc.nextDouble();
		
		if((number > 0) && (number <= 25))
		{
			System.out.println("Intervalo (0,25]");
		}
		else if((number > 25) && (number <= 50))
		{
			System.out.println("Intervalo (25,50]");
		}
		else if((number > 50) && (number <= 75))
		{
			System.out.println("Intervalo (50,75]");
		}
		else if((number > 75) && (number <= 100))
		{
			System.out.println("Intervalo (75,100]");
		}
		else
		{
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
	}
}
