// Tariq
//
// This program will test the methods of Dice, Quiz, Tally, and the Measurable interface.

import javax.swing.JTextArea;
import java.util.ArrayList;
import java.awt.Container;
import javax.swing.JFrame;
import java.util.Random;
import java.awt.Font;

public class U8Test extends JFrame
{
	private ArrayList<Dice> tosses = new ArrayList<Dice>();
	private ArrayList<Quiz> quizzes = new ArrayList<Quiz>();

	public static void main(String[] args)
	{
		U8Test u8test = new U8Test();

		u8test.setSize(300, 500);
		u8test.setVisible(true);
		u8test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U8Test()
	{
		JTextArea out = new JTextArea();
		out.setFont(new Font("Monospaced", Font.PLAIN, 14));
		Random r = new Random();

		String[] diceoutcomes = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		String[] quizoutcomes = new String[] {"A", "B", "C", "D", "F"};
		Tally dicetally = new Tally(diceoutcomes);
		Tally quiztally = new Tally(quizoutcomes);

		for (int i=0; i<100; i++)
		{
			tosses.add(new Dice(r.nextInt(6)+1, r.nextInt(6)+1));
			quizzes.add(new Quiz(r.nextInt(101)));

			dicetally.process(tosses.get(i));
			quiztally.process(quizzes.get(i));
		}

      	out.append("\tDice Tally\n\t----------\n\nItem\t\tTally\n----\t\t-----\n");
      	for(int i=0; i<11; i++)
      	{
			out.append(" "+diceoutcomes[i]+"\t\t "+dicetally.getTally()[i]+"\n");
		}

      	out.append("\n\n\n\tQuiz Tally\n\t----------\n\nItem\t\tTally\n----\t\t-----\n");
      	for(int i=0; i<5; i++)
      	{
			out.append(" "+quizoutcomes[i]+"\t\t "+dicetally.getTally()[i]+"\n");
		}

		Container container = getContentPane();
		container.add(out);
	}
}