// Tariq
//
// This class will test the methods of
// the U1Test class.

public class U1TestDriver
{
	public static void main(String[] args)
	{
		U1Test emp = new U1Test();

		String name;
		double salary;

		String x = emp.getName();
		double a = emp.getSalary();
		System.out.print("Name = " + x);
		System.out.println("   Salary = " + a);

		emp.raiseSalary(4);
		double b = emp.getSalary();
		System.out.println("Salary = " + b);

		emp.bonus(200);
		double c = emp.getSalary();
		System.out.println("Salary = " + c);

		emp.raiseSalary(5.5);
		double d = emp.getSalary();
		System.out.println("Salary = " + d);
	}
}

/*

Name = Hacker, Harry   Salary = 55000.0
Salary = 57200.0
Salary = 57400.0
Salary = 60557.0
Press any key to continue . . .

*/
