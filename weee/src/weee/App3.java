package weee;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.event.ItemListener;

public class App3 extends Applet 
{
	Checkbox c1,c2;
	public void init()
	{
		c1 = new Checkbox("Java");
		c2 = new Checkbox("JavaScript");
		add(c1);
		add(c2);
}
}
