package weee;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App5 extends Applet 
{
	Button b1 = new Button("SUBASH");
	public void init()
	{
		
	}
	public void paint(Graphics g)
	{
		int x[] = {50,90,10};
		int u[] = {10,60,90};
		int p =3;
		g.drawPolygon(x,u,p);
	}
}

