package pattern;

import java.util.Scanner;

public class PatternProgram2 
{
	public static void main (String args[])
	{
		/* System.out.print("Enter the Total Number ");
		Scanner get = new Scanner(System.in); // Using Scanner Class to get Input from the User.
		int totalColumn = get.nextByte(); */
		patternProgram();
	}
	
		static void patternProgram()
		{
			for (int row=5;row>=1;row--)
			{
				for (int column=1;column<=row;column++)
				{
					System.out.print(row + " ");
				}
				System.out.println();
			}
		}
}
