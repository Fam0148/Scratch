package weee;

import java.applet.*;
import java.awt.Checkbox;
import java.awt.TextField;

public class App extends Applet
{
	Checkbox c1 = new Checkbox("Java");
	TextField t1 = new TextField();
	public void init()
	{
		add(c1);
		t1.setText("Hai There");
		add(t1);
		
	} 
}