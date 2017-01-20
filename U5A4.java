// Name
//
// This program will simulate "The Game of Life".

import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;


public class U5A4 extends JFrame
{
	private JTextArea out = new JTextArea();
	private String board[][]= {{" ", " ", " ", " ", " ", " "},
							   {" ", " ", "*", " ", " ", " "},
							   {" ", " ", " ", "*", " ", " "},
							   {" ", "*", "*", "*", " ", " "},
							   {" ", " ", " ", " ", " ", " "},
							   {" ", " ", " ", " ", " ", " "}};

	public U5A4()
	{
		Container container = getContentPane();
		out.setFont(new Font("Monospaced", Font.PLAIN, 15));
		out.setText("Generation 0\n");
		container.add(out);

		printMatrix();
		out.append("Generation 2\n");
		nextGeneration();
		nextGeneration();
		printMatrix();

		out.append("Generation 4\n");
		nextGeneration();
		nextGeneration();
		printMatrix();

		setSize(200, 500);
		setVisible(true);
	}

	private static void main(String args[])
	{
		U5A4 application = new U5A4();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void printMatrix()
	{
		for (int j=0; j<6; j++)
		{
			out.append("|");
			for (int k=0; k<6; k++)
			{
				out.append(board[j][k] + "|");
			}

			out.append("\n");
			out.append("-------------\n");
		}
	}

	private void nextGeneration()
	{
		String[][] temp = new String[6][6];

		for (int i=0; i<6; i++)
		{
			for (int c=0; c<6; c++)
			{
				if(findNeighbors(i, c) >=4) temp[i][c] = " ";
				if(findNeighbors(i, c) ==3) temp[i][c] = "*";
				if(findNeighbors(i, c) ==2)
				{
					if(board[i][c].equals("*")) temp[i][c] = "*";
					else temp[i][c] = " ";
				}
				if(findNeighbors(i, c) < 2) temp[i][c] = " ";
			}
		}

		board = temp;
	}

	private int findNeighbors(int row, int col)
	{
		int neighbors = 0;
		for (int i=row-1; i<=row+1; i++)
		{
			for (int j = col-1; j<=col+1; j++)
			{
				if (i==row && j==col) continue;

				try
				{
					if (board[i][j].equals("*")) neighbors++;
				}

				catch(RuntimeException e)
				{
					continue;
				}
			}
		}
		return neighbors;
	}
}
