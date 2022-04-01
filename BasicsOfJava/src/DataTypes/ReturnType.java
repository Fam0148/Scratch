package DataTypes;

class Return
{
	int number1;
	String name;
	int numberReturnType(int num)
	{
		this.number1 = num;
		return number1;
	}
	
	String numberStringType(String name1)
	{
		this.name = name1;
		return name;
	}
}
public class ReturnType 
{
	public static void main(String[] args) 
	{
		Return number1 = new Return();
		Return name = new Return();
		System.out.println(number1.numberReturnType(12)); // Return Number
		System.out.println(name.numberStringType("SUBASH"));
	}
}
