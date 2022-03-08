package controlStatement;
import java.util.*;
public class DecisionMaking {
	public static void main(String args[])
	{
		//if and if-else Condition
		
			Scanner Input =  new Scanner (System.in);
			System.out.print("Enter the Age : ");
			byte age = Input.nextByte();
			if (age >= 18)
			{
				System.out.println("You are Eligible for Vote");
			}else
			{
				System.out.println("You are not Eligible for Vote");
			}
		
		//if-else-if
			
			System.out.print("Enter the Age for Pancard Application : ");
			byte panCardAge = Input.nextByte();
			if (panCardAge >=15)
			{
				System.out.printf(" Your Age is %d : You can take Pancard without photo",panCardAge).println();
			}
			else if(panCardAge > 18)
			{
				System.out.printf(" Your Age is %d : You can take Pancard with photo",panCardAge).println();
			}
			else 
			{
				System.out.printf(" Your Age is %d : You can't take Pancard ",panCardAge).println();
			}
		
	}

}
