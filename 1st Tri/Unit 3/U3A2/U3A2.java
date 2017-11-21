// This program will act as an online tax helper.

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class U3A2 extends JApplet
{
	private String name;
	private double tax = 0;
	private double answer;
	private String type;

	public void init()
	{
		name = JOptionPane.showInputDialog("Enter your name: ");
		String status = JOptionPane.showInputDialog("Enter Filing Status - Single(S) or Married(M): ");
		String blind = JOptionPane.showInputDialog("Are you blind? Yes or No: ");
		String over65 = JOptionPane.showInputDialog("Are you over 65? Yes or No: ");
		String exemp = JOptionPane.showInputDialog("Enter total number of exemptions: ");
		String wag = JOptionPane.showInputDialog("Enter wage, salaries, & tips: ");
		String withheld = JOptionPane.showInputDialog("Enter Income Tax Withheld: ");

		double wage = Double.parseDouble(wag);
		double with = Double.parseDouble(withheld);
		int deduc = Integer.parseInt(exemp);

		if ("Yes".equals(blind)) deduc = deduc+1;
		if ("Yes".equals(over65)) deduc = deduc+1;

		if("M".equals(status))
		{
			String spouseblind = JOptionPane.showInputDialog("Is your spouse blind? Yes or No: ");
			String spouseover65 = JOptionPane.showInputDialog("Is your spouse over 65? Yes or No: ");
			if("Yes".equals(spouseblind)) deduc = deduc + 1;
			if ("Yes".equals(spouseover65)) deduc = deduc + 1;
		}

		deduc = deduc * 1000;
		wage = wage - deduc;

		if("M".equals(status))
		{
			if ((wage > 0) && (wage <= 35800)) tax = (wage-0) * 0.15;
			if ((wage > 35800) && (wage <= 86500)) tax = ((wage-35800) * 0.28) + 5370.00;
			if (wage > 86500) tax = ((wage-86500) * 0.31) + 19566.00;
		}

		if("S".equals(status))
		{
			if ((wage > 0) && (wage <= 21450)) tax = (wage-0) * 0.15;
			if ((wage > 21450) && (wage <= 51900)) tax = ((wage-21450) * 0.28) + 3217.50;
			if (wage > 51900) tax = ((wage-51900) * 0.31) + 11743.50;
		}

		if (tax > with)
		{
			answer = tax - with;
			type = "Owe";
		}
		else
		{
			answer = with - tax;
			type = "Refund";
		}

	}

	public void paint(Graphics g)
	{
		String a = String.format(type + " =    $%7.2f", answer);
		g.setColor(Color.black);
		g.drawString(name + ", below you will find", 10, 50);
		g.drawString("the results of your Tax Inquiry.", 10, 65);
		g.drawString(a, 60, 120);
	}
}
