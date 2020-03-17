import java.util.Locale;
import java.util.Scanner;
import Entities.Student;;

public class ex3 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student student = new Student();
		double finalGrade;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		finalGrade = student.FinalGrade();
		System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
		if(finalGrade >= 60.00)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAILED");
			finalGrade = 60 - finalGrade;
			System.out.printf("MISSING %.2f POINTS", finalGrade);
		}
		
		sc.close();
	}
}
