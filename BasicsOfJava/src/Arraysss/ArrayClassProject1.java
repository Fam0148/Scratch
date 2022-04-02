package Arraysss;

class Student
{
	String name;
	int [] marks;
		Student(String name, int[] subMarks)
		{
			this.name = name;
			this.marks= subMarks;
		}
		public int getNumberOfMarks() 
		{
			return marks.length;
		}
}
public class ArrayClassProject1 
{
	public static void main(String[] args) 
	{
		int [] marks = {98,45,56};
		Student student = new Student("Ranga",marks);
		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks = " + number);
	}
}
