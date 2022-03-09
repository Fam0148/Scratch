package method;

public class MethodOverLoading
{
	public static void main (String Args[])
	{
		applicationForm("Subash", 989898989, 16);
		applicationForm("Subash", 989898989, 1234512, 16);
	}
	
	static void applicationForm(String name, int number, int age)
	{
		System.out.println("---- Method ----");
		System.out.printf("The name is %s", name).println();
		System.out.printf("The Mobile Number is %d", number).println();
		System.out.printf("The Age is %d \n", age).println();
		
	}
	static void applicationForm(String name, int number, int number2, int age)
	{
		System.out.println("---- Method Overloading----");
		System.out.printf("The name is %s", name).println();
		System.out.printf("The Mobile Number is %d", number).println();
		System.out.printf("The Mobile Number2 is %d", number2).println();
		System.out.printf("The Age is %d", age).println();	
	}
}
