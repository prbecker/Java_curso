package Application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

import Entities.Employee;

public class ex2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int numberOfEmployees;
		List<Employee> employees = new ArrayList<Employee>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	

		System.out.println("How many employees will be registered? ");	
		numberOfEmployees = sc.nextInt();
		
		for(int i=0; i<numberOfEmployees; i++)
		{
			System.out.printf("Employee #%d:%n", i+1);
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			Employee emp = new Employee(id, name, salary);
			employees.add(emp);
			System.out.println();	
		}
		
		System.out.println("Enter the employee id that will have salary increase : ");	
		int id = sc.nextInt();
		
		Employee empIncrease = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (empIncrease == null) 
		{
			System.out.println("This id does not exist!");
		}
		else 
		{
			System.out.println("Enter the porcentage: ");	
			double increase = sc.nextDouble();
			empIncrease.increaseSalary(increase);
		}
		
		System.out.println();
		System.out.println("List of employees");
		for(int i=0; i<employees.size(); i++)
		{
			Employee emp = employees.get(i);
			System.out.printf("%d, %s, %.2f%n", emp.getId(), emp.getName(), emp.getSalary());
		}
		
		sc.close();
	}
}
