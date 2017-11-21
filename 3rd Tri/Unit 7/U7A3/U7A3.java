// This program will start a game of tic tac toe using the Piece and Board classes.

import javax.swing.JOptionPane;

public class U7A3
{
	private Board board = new Board(3, 3);
	private int i=0;

	public static void main(String[] args)
	{
		U7A3 u7a3 = new U7A3();
	}

	public U7A3()
	{
		Piece x = new Piece("X");
		Piece o = new Piece("O");

		setBoard();

		for(i=1; i<10; i++)
		{
			updateBoard(i);
			if(whoWon(x).equals("X") || whoWon(o).equals("O"))
			{
				JOptionPane.showMessageDialog(null, "Player "+whoWon(x)+whoWon(o)+" has won!", "Game Over!", JOptionPane.PLAIN_MESSAGE);
				break;
			}
		}

		if(!whoWon(x).equals("X") && !whoWon(o).equals("O"))
			JOptionPane.showMessageDialog(null, "Draw!", "Game Over!", JOptionPane.PLAIN_MESSAGE);
	}

	public void setBoard()
	{
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				Piece empty = new Piece();
				board.addPiece(empty, i, j);
			}
		}

		board.drawBoard();
	}

	public void updateBoard(int counter)
	{
		int row = 0;
		int col = 0;
		int cell;

		if(counter==1 || counter==3 || counter==5 || counter==7 || counter==9)
		{
			String input = JOptionPane.showInputDialog("PLAYER X - Enter a cell number (1-9) to place your piece in:");
			cell = Integer.parseInt(input.substring(0));
		}
		else
		{
			String input = JOptionPane.showInputDialog("PLAYER O - Enter a cell number (1-9) to place your piece in:");
			cell = Integer.parseInt(input.substring(0));
		}

		switch(cell)
		{
			case 1:
				row=0;
				col=0;
				break;
			case 2:
				row=0;
				col=1;
				break;
			case 3:
				row=0;
				col=2;
				break;
			case 4:
				row=1;
				col=0;
				break;
			case 5:
				row=1;
				col=1;
				break;
			case 6:
				row=1;
				col=2;
				break;
			case 7:
				row=2;
				col=0;
				break;
			case 8:
				row=2;
				col=1;
				break;
			case 9:
				row=2;
				col=2;
				break;
		}

		if(!board.isOccupied(row, col))
		{
			if(counter==1 || counter==3 || counter==5 || counter==7 || counter==9)
			{
				Piece temp = new Piece("X");
				board.addPiece(temp, row, col);
			}
			else
			{
				Piece temp = new Piece("O");
				board.addPiece(temp, row, col);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You cannot stack pieces!", "Error", JOptionPane.ERROR_MESSAGE);
			i--;
		}

		board.drawBoard();
	}

	public String whoWon(Piece player)
	{
		Piece[][] pieces = board.getBoard();

        if (pieces[0][0].equals(player) && pieces[0][1].equals(player) && pieces[0][2].equals(player) ||
            pieces[1][0].equals(player) && pieces[1][1].equals(player) && pieces[1][2].equals(player) ||
            pieces[2][0].equals(player) && pieces[2][1].equals(player) && pieces[2][2].equals(player) ||
            pieces[0][0].equals(player) && pieces[1][0].equals(player) && pieces[2][0].equals(player) ||
            pieces[0][1].equals(player) && pieces[1][1].equals(player) && pieces[2][1].equals(player) ||
            pieces[0][2].equals(player) && pieces[1][2].equals(player) && pieces[2][2].equals(player) ||
            pieces[0][0].equals(player) && pieces[1][1].equals(player) && pieces[2][2].equals(player) ||
            pieces[2][0].equals(player) && pieces[1][1].equals(player) && pieces[0][2].equals(player))
            return player.getID();
		return "";
	}
}