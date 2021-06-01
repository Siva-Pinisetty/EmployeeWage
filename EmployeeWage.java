package employeewage;
import java.util.Random;
public class EmployeeWage {
public static void main(String[] args) {
	System.out.println("Welocome to Employee Wage Computation Problem");
	Random random = new Random();
	int Ran = random.nextInt(2);
	if (Ran == 1)
	{
		System.out.println("Employee is Present");
	}	
	else
	{
		System.out.println("Employee is Absent");
	}
}
}
