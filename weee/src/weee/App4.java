package weee;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App4 extends Applet implements ActionListener
{
	Button clk,clr;
	String store;
	public void init()
	{
		clr = new Button("Clear");
		clk = new Button("Click");
		add(clk);
		add(clr);
		clk.addActionListener(this);
		clr.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString(store,60,50);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String str = e.getActionCommand();
		if(str.equals("Click")==true)
		{
			store = "Hello";
		}
		else
		{
			store = "Bye";
		}
			repaint();
	}
}
