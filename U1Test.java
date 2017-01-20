// Name
//
// This program will calculate the salary of employee "Harry".

public class U1Test
{
	private String name;
	private double salary;

	public U1Test()
	{
		name = "Hacker, Harry";
		salary = 55000;
	}

	public double getSalary()
	{
		return salary;
	}

	public String getName()
	{
		return name;
	}

	public void raiseSalary(double x)
	{
		salary = (1+x/100) * salary;
	}

	public void bonus(int y)
	{
		salary = y + salary;
	}
}
