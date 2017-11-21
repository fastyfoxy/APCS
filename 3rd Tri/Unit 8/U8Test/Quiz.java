// This program will structure an object representing the results of a quiz.

public class Quiz implements Measurable
{
	private int score;
	private String grade;

	public Quiz(int num)
	{
		score = num;
		setGrade();
	}

	public void setGrade()
	{
		if (score>=90) grade = "A";
		else if (score>=80 && score<90) grade = "B";
		else if (score>=70 && score<80) grade = "C";
		else if (score>=60 && score<70) grade = "D";
		else if (score<60) grade = "F";
	}

	public String getResult()
	{
		return grade;
	}
}