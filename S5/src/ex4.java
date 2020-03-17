import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar 
//em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

public class ex4 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int inicio, fim, horas;
		
		Scanner sc = new Scanner(System.in);
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if(inicio < fim)
		{
			horas = fim - inicio;
			System.out.println("O JOGO DUROU " + horas + " HORA(S)");
		}
		else if(inicio > fim)
		{
			horas = 24 - inicio + fim;
			System.out.println("O JOGO DUROU " + horas + " HORA(S)");
		}
		else
		{
			horas = 24;
			System.out.println("O JOGO DUROU " + horas + " HORA(S)");
		}
		
		sc.close();
	}
}
