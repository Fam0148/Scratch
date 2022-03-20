package controlStatement;
import java.util.Scanner;
public class Switch 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number 0 - 6");
		byte input = scan.nextByte();
		System.out.println("The Number You Entered is - "+ input);
		System.out.println(checkDay(input));		
	}
	
	static String checkDay(byte day)
	{
		
	/* Instead of Using A Break, We can Also use the Return Statement, 
	Because after Seeing return it doesn't execute after that */
		
		switch(day) 
		{
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thrusday";
		case 5: return "Friday";
		case 6: return "Saturday";
		}
		return "Given is Inavlid";
	}
}
