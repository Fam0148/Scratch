package weee;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;

public class App2 extends Applet
{
	Label l;
	public void init()
	{
		l=new Label("SUBASH");
		l.setBackground(Color.yellow);
		add(l);
	}
}
