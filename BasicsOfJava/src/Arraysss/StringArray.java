package Arraysss;

public class StringArray 
{
	public static void main(String[] args) 
	{
		String[] weekDays = {"Sun","Mon","Tues","Wed","Thurs","Fri","Sat"};
		// Descending Order the Array Items:
		System.out.println("Descending");
		for(int i=weekDays.length-1;i>=0;i--)
		{
			System.out.printf(weekDays[i]+" ");
		}
		System.out.println();
		// Ascending Order the Aray Items:
		System.out.println("Ascending");
		for (int i=0;i<weekDays.length;i++)
		{
			System.out.printf(weekDays[i]+" ");
		}
	}
}

	