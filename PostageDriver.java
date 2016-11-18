// Tariq
//
// This program will test the methods of the Postage class.

import javax.swing.JOptionPane;
import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class PostageDriver extends JApplet
{
	double cost;
    public void init()
    {
        String input = JOptionPane.showInputDialog("Enter Postage Type & ounces, separated by a space:");
        double weight = Double.parseDouble(input.substring(2));
        String type = input.substring(0,1);
        Postage a = new Postage(type, weight);
        cost = a.calculate();
        setBackground(Color.white);
   	}

    public void paint(Graphics g)
    {
		g.setColor(Color.black);
		String out = "Cost to mail this item =";
		String result = String.format("$ %1.2f", cost);
		g.drawString(out, 10, 50);
		g.drawString(result, 26, 70);
    }
}