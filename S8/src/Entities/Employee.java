package Entities;

public class Employee 
{
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary()
	{
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage)
	{
		grossSalary = grossSalary * ((100 + percentage) / 100);
	}
}
