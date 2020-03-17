import java.util.Scanner;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
public class ex2For
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int N, number = 0, i, nIn = 0, nOut = 0;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for (i = 0; i < N; i++) 
		{
			number = sc.nextInt();
			if((number >= 10) && (number <= 20))
			{
				nIn += 1;
			}
			else
			{
				nOut += 1;
			}
		}
		System.out.println(nIn + " in");
		System.out.println(nOut + " out");
		
		sc.close();
	}
}
