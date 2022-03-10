package datatypes;

public class DataTypes 
{

	public static void main(String[] args)
	{
		// Interger Datatypes
		byte age = 16;
		short employeeId = 3433;
		int population = 1234334;
		System.out.printf("The Age is %d",age).println();
		System.out.printf("The employeeId is %d",employeeId).println();
		System.out.printf("The population is %d",population).println();
		
		//Floating Points
		float percentage = 72.23f;
		double pie = 3.14;
		System.out.printf("The Percentage is %.2f",percentage).println();
		System.out.printf("The Value of Pie is %.3f",pie).println();
		
		//Character 
		char grade = 'o';
		System.out.printf("The Grade is %c",grade).println();
		
		//String
		String name = "SUBASH";
		System.out.printf("My name is %s",name).println();
		
		//String with Creating New Object
		String nameOfStudent = new String("Ranjith-Kumar");
		System.out.printf("The Student Name is %s",nameOfStudent).println();
		
	}

}
