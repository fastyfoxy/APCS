// This class will test the methods of the SalaryManager class.

public class U1Test
{
	public static void main(String[] args)
	{
		SalaryManager sal = new SalaryManager();

		String name;
		double salary;

		String x = sal.getName();
		double a = sal.getSalary();
		System.out.print("Name = " + x);
		System.out.println("   Salary = " + a);

		sal.raiseSalary(4);
		double b = sal.getSalary();
		System.out.println("Salary = " + b);

		sal.bonus(200);
		double c = sal.getSalary();
		System.out.println("Salary = " + c);

		sal.raiseSalary(5.5);
		double d = sal.getSalary();
		System.out.println("Salary = " + d);
	}
}