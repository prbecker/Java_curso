import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
public class ex4For 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N, i;
		double div, n1, n2;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for (i = 0; i < N; i++) 
		{
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			if(n2 == 0)
			{
				System.out.println("divisao impossivel");
			}
			else
			{
				div = n1 / n2;
				System.out.println(div);
			}
		}

		sc.close();
	}
}
