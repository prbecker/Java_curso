import java.util.Scanner;

//Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 
//3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser 
//escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel.
public class ex3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int combustivel = 0, alcool = 0, gasolina = 0, diesel = 0;
		
		Scanner sc = new Scanner(System.in);
		
		combustivel = sc.nextInt();		
		while(combustivel != 4)
		{
			switch(combustivel)
			{
				case 1:
				{
					alcool += 1;
					break;
				}
				case 2:
				{
					gasolina += 1;
					break;
				}
				case 3:
				{
					diesel += 1;
					break;
				}
				default:
				{
					break;
				}				
			}
			combustivel = sc.nextInt();	
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
