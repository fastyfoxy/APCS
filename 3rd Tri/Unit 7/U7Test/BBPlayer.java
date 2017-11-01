// Tariq
//
// This program will parse an input string and fill all instance fields.

import java.util.StringTokenizer;

public class BBPlayer
{
	private int num;
	private int year;
	private String pos;
	private double ppg;

	public BBPlayer(String input)
	{
		StringTokenizer st = new StringTokenizer(input);

		num = Integer.parseInt(st.nextToken());
		year = Integer.parseInt(st.nextToken());
		pos = st.nextToken();
		ppg = Double.parseDouble(st.nextToken());
	}

	public int getNum()
	{
		return num;
	}

	public int getYear()
	{
		return year;
	}

	public String getPos()
	{
		return pos;
	}

	public double getPPG()
	{
		return ppg;
	}
}