package wrapperclass;

public class WrapperClass 
{
	public static void main(String[] args) 
	{
		Integer i = new Integer(1); // Here the reference object hold the address, so we can't make the equals the Condition. It always create the new object.
		Integer i1 = new Integer(1);
		
		Integer i2 = Integer.valueOf(1);// We using the  valueOf method, it always re-use the value once it already created, it doesn't create the new object.
		Integer i3 = Integer.valueOf(1);
		
		if(i==i1)
		{
			System.out.println("It is Not Efficient way to Create Wrapper Class");
		}
		else if(i2==i3)
		{
			System.out.println("It is  Efficient way to Create Wrapper Class");
		}
		
	}
}
