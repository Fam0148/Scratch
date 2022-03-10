package pattern;
import java.util.*; // This package Contains the Scanner Class.
public class PatternProgram1
{
	public static void main (String args[])
	{
		System.out.print("Enter the Total Number ");
		Scanner get = new Scanner(System.in); // Using Scanner Class to get Input from the User.
		int totalColumn = get.nextByte();
		patternProgram(1,2,totalColumn); // Call the Method patterProgram().
	}
	
		static void patternProgram(int row, int column,int input)
		{
			for (row=1;row<=input;row++)
			{
				for (column=1;column<=row;column++)
				{
					System.out.print(row);
				}
				System.out.println();
			}
		}
}
