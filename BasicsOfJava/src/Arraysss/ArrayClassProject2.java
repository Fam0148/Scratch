package Arraysss;

class Students
{
	private String name;
	private int [] marks;
	private int sum =0;
	private int max =Integer.MIN_VALUE;
	private int mini = Integer.MAX_VALUE;
		Students(String name, int[] subMarks)
		{
			this.name = name;
			this.marks= subMarks;
		}
		public int getNumberOfMarks() 
		{
			return marks.length;
		}
		public int getTotalSumOfMarks() 
		{
			for(int marks:marks)
			{
				sum = sum + marks;
			}
			return sum;
		}
		public int getMaximumMark() 
		{
			for(int marks:marks)
			{
				if(marks>max)
				{
					max=marks;
				}
			}
			return max;
		}
		public int getMimimumMark() 
		{
			for(int marks:marks)
			{
				if(marks<mini)
				{
					mini=marks;
				}
			}
			return mini;

		}
}
public class ArrayClassProject2 
{
	public static void main(String[] args) 
	{
		int [] marks = {98,45,56};
		Students student = new Students("Ranga",marks);
		int number = student.getNumberOfMarks();
		System.out.println("Number of Subjects = " + number);
//		--------------------------------------------------
		int sum = student.getTotalSumOfMarks();
		System.out.printf("Sum of Marks = %d/300", sum).println();
//		--------------------------------------------------
		int maximumMark = student.getMaximumMark();
		System.out.printf("Maximum Mark in Subject %d", maximumMark).println();
//		--------------------------------------------------
		int minimumMark = student.getMimimumMark();
		System.out.printf("Minimum Mark in Subject %d", minimumMark);
	}
}
