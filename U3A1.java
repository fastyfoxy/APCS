// Name
//
// This program will convert letter grades into numeric grades
// and convert numeric grades into letter grades.

public class U3A1
{
	private String origLetter;
	private double origNumeric;
	private String newLetter;
	private double newNumeric;

	public U3A1(String x, double y)
	{
		origLetter = x;
		origNumeric = y;
		setNewNumeric();
		setNewLetter();
	}

	private void setNewNumeric()
	{
		if (origLetter.substring(0,1).equals("A")) newNumeric = 4.0;
		else if (origLetter.substring(0,1).equals("B")) newNumeric = 3.0;
		else if (origLetter.substring(0,1).equals("C")) newNumeric = 2.0;
		else if (origLetter.substring(0,1).equals("D")) newNumeric = 1.0;
		else newNumeric = 0;

		int a = origLetter.length();
		if (a==2)
		{
			String aplus = "A+";
			if (origLetter.equals(aplus)) newNumeric = 4.0;
			else
			{
				String sign = origLetter.substring(1);
				String plus = "+";
				if (sign.equals(plus)) newNumeric = newNumeric + 0.3;
				else newNumeric = newNumeric - 0.3;
			}
		}

	}

	private void setNewLetter()
	{
		if (origNumeric == 4.0) newLetter = "A+";
		else if ((origNumeric >= 3.85) && (origNumeric <= 3.99)) newLetter = "A";
		else if ((origNumeric >= 3.50) && (origNumeric <= 3.84)) newLetter = "A";
		else if ((origNumeric >= 3.15) && (origNumeric <= 3.49)) newLetter = "B+";
		else if ((origNumeric >= 2.85) && (origNumeric <= 3.14)) newLetter = "B";
		else if ((origNumeric >= 2.50) && (origNumeric <= 2.84)) newLetter = "B-";
		else if ((origNumeric >= 2.15) && (origNumeric <= 2.49)) newLetter = "C+";
		else if ((origNumeric >= 1.80) && (origNumeric <= 2.14)) newLetter = "C";
		else if ((origNumeric >= 1.45) && (origNumeric <= 1.79)) newLetter = "C-";
		else if ((origNumeric >= 1.10) && (origNumeric <= 1.44)) newLetter = "D+";
		else if ((origNumeric >= 0.75) && (origNumeric <= 1.09)) newLetter = "D";
		else if ((origNumeric >= 0.40) && (origNumeric <= 0.74)) newLetter = "D-";
		else newLetter = "F";
	}


	String getNewLetter()
	{
		return newLetter;
	}

	double getNewNumeric()
	{
		return newNumeric;
	}
}
