package employeewage;
import java.util.Random;
public class EmployeeWage {
public static void main(String[] args) {
	System.out.println("Welocome to Employee Wage Computation Problem");
	Random random = new Random();
	int Ran = random.nextInt(3);
	int empPerHr=20;
	int empHr = 0;
	if (Ran == 2)
	{
		System.out.println("Employee is Full Present");
		empHr=8;
	}	
	else if (Ran == 1)
	{
		System.out.println("Employee is Part-time Present");
		empHr=4;
	}
	else
	{
		System.out.println("Employee is Absent");
	}
	int Salary=empPerHr*empHr;
	System.out.println("His Salary is "+Salary);
}
}
