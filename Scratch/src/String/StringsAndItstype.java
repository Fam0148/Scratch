package String;

public class StringsAndItstype
{
	public static void main(String[] args) 
	{
		
		// 1) Instantiating the Object
			
			String name = new String("Java");
			
		// 2) Direct Initializing
			
			String name2 = "Object Oriented Programming Language";
			
			System.out.println("Length of the String - " + name2.length());
			System.out.println("Index of the String - " + name2.charAt(0));
			System.out.println("Checking the String - " + name.contains("S"));
			System.out.println(name.equals(name2));
			System.out.println(name2.startsWith("O"));
	}
	
}