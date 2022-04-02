package Arraysss;

import java.util.Arrays;

public class BasicOfArray 
{
	public static void main(String[] args) 
	{
		int marks[] = new int[4]; // Default it Fills Zero.
		double decimal[] = new double[4];// Default it Fills decimal digits.
		String name[] = new String[4]; // Default it Fills Null.
		boolean isTrue[] = new boolean[4];// Default it Fills False.
//----------------------------------------------------------------------------		
		int marks1[] = {1,2,3,4};
		System.out.println(Arrays.toString(marks1));
		System.out.println(Arrays.toString(marks));
		System.out.println(Arrays.toString(decimal));
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(isTrue));
//----------------------------------------------------------------------------
		System.out.print(Arrays.equals(marks1,marks1)); // Compare To Array.
	}
}
