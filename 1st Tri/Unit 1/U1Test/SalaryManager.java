// This program will manage the salary of employee "Harry".

public class SalaryManager
{
	private String name;
	private double salary;

	public SalaryManager()
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
