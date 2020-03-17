import java.util.Locale;
import java.util.Scanner;
import Entities.Employee;

public class ex2
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.NetSalary());
		
		System.out.printf("Which percentage to increase salary? ");
		emp.IncreaseSalary(sc.nextDouble());
		System.out.printf("Updated data: %s, $ %.2f%n", emp.name, emp.NetSalary());
		
		sc.close();
	}
}
