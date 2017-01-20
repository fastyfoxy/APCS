// Name
//
// This program will simulate a simplified version of the Iowa lottery game.

public class U5A2
{
	private int[] numbers = new int[5];
	private int powerball;

	public U5A2()
	{
		int[] smart = new int[59];
		int num;

		for(int i = 1; i<=59; i++)	smart[i-1] = i;

		for(int i=0; i<numbers.length; i++)
		{
			do num = (int)(58*Math.random()+1);
			while(smart[num] == 0);

			numbers[i] = smart[num];
			smart[num] = 0;
		}

		powerball = (int)((35-1+1)*Math.random()+1);
	}

	public int check(int[] nums, int pb)
	{
		int numsmatch = 0;
		for(int i=0; i<5; i++) for(int c=0; c<5; c++) if(nums[i] == numbers[c]) numsmatch++;

		if((numsmatch == 5) && (pb == powerball)) return 1000000;
		if((numsmatch == 5) && (pb != powerball)) return 500000;
		if((numsmatch == 4) && (pb == powerball)) return 10000;
		if((numsmatch == 4) && (pb != powerball)) return 100;
		if((numsmatch == 3) && (pb == powerball)) return 100;
		if((numsmatch == 3) && (pb != powerball)) return 7;
		if((numsmatch == 2) && (pb == powerball)) return 7;
		if((numsmatch == 1) && (pb == powerball)) return 4;
		if((numsmatch == 0) && (pb == powerball)) return 4;
		if((numsmatch == 0) && (pb != powerball)) return 0;
		return 0;
	}

	public int[] getNumbers()
	{
		return numbers;
	}

	public int getPowerball()
	{
		return powerball;
	}
}
