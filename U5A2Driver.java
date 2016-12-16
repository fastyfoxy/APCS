// Tariq
//
// This program will test the methods of the U5A2 class.

public class U5A2Driver
{
	public static void main(String[] args)
	{
		U5A2 a = new U5A2();
		int[] N = a.getNumbers();
		System.out.println("This Week's Numbers Are:\n"+N[0]+"  "+N[1]+"  "
		+N[2]+"  "+N[3]+"  "+N[4]+"  "+a.getPowerball());

		int c4 = 0;
		int c7 = 0;
		int c100 = 0;
		int c10000 = 0;
		int chalfmil = 0;
		int cmil = 0;

		for(int i = 1; i<=1000000; i++)
		{
			int[] smart = new int[59];
			int[] nums = new int[5];
			int num;

			for(int c = 1; c<=59; c++)	smart[c-1] = c;

			for(int j=0; j<nums.length; j++)
			{
				do num = (int)(58*Math.random()+1);
				while(smart[num] == 0);

				nums[j] = smart[num];
				smart[num] = 0;
			}

			int powerball = (int)((35-1+1)*Math.random()+1);

			int amt = a.check(nums, powerball);

			if(amt>=10000)
			{
				System.out.println("\nPlayer #"+i+" wins: $"+a.check(nums, powerball));
				System.out.println(nums[0]+"  "+nums[1]+"  "+nums[2]+"  "+nums[3]+"  "+nums[4]+"  "+powerball);
			}

			if(amt == 4) c4++;
			if(amt == 7) c7++;
			if(amt == 100) c100++;
			if(amt == 10000) c10000++;
			if(amt == 500000) chalfmil++;
			if(amt == 1000000) cmil++;
		}
			System.out.println("\n$4 Winners:         "+c4);
			System.out.println("$7 Winners:         "+c7);
			System.out.println("$100 Winners:       "+c100);
			System.out.println("$10,000 Winners:    "+c10000);
			System.out.println("$500,000 Winners:   "+chalfmil);
			System.out.println("$1,000,000 Winners: "+cmil);
	}
}