package controlStatement;
import java.util.Scanner;
public class Loops 
{
	public static void main (String args[])
	{
		 
		// do-while Loop
		
			short number = 0;
			System.out.println("DO WHILE LOOP");
			System.out.print("It prints the Series of Number from 1 to 10 \n");
			do
			{
				number+=1;
				System.out.printf("%d.",number);
			}while(number<10);
			System.out.println("\n");
			
		//while Loop
			
			System.out.println("WHILE LOOP");
			byte age = 0;
			while(age <=10)
			{
				System.out.print(age);
				age++;
			}
			System.out.println("\n");
			
		//for Loop
			
			System.out.println("FOR LOOP");
			for (int i =0;i<=number;i++ )
			{
				System.out.print(i);
			}
		
	}

}
