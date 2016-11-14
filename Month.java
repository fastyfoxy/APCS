// Tariq
//
// This program will tell the user the number of days in a month

public class Month
{
	private int month;
	private String days;

	public Month(int x)
	{
		month = x;
		setDays();
	}

	public void setDays()
	{
		switch(month)
		{
			case 2:
				days = "28 or 29";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = "30";
				break;
			default:
				days = "31";
		}
	}

	public String getDays()
	{
		return days;
	}
}