package method;

public class StartingWithMethod
{	
		public static void main (String Args[])
		{
			withoutPassingArguments(); // Calling function with method:
			
			withPassingArguments("SUBASH"); // Calling function with method and Passing a Arguments:
		}
		
			public static void withoutPassingArguments()
			{
				System.out.println("This the Method without Arguments \n");
			}
		
			public static void withPassingArguments(String personName)
			{
				System.out.printf("My Name is %s",personName);
			}
	

}
