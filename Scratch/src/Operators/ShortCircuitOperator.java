package Operators;

class C1{
	int no1 = 10;
	int no2 = 20;
	
	void shortCircutOperator()
	{
		if ((no1 > 10) && (no2++ >18)) // The Short Circuit Operator is Very Lazy so it Can't Check if the 1st condition is False, so value is not incremented. 
		{
			System.out.print(no2);
		}
		else 
		{
			System.out.print(no2);
		}
	}
	void normalOperator()
	{
		if ((no1 > 10) & (no2++ >18)) // The Normal And Operator Check if the 1st condition and make the Increment, so value is incremented.
		{
			System.out.print(no2);
		}
		else 
		{
			System.out.println(no2);
		}
	}
}

public class ShortCircuitOperator 
{
	public static void main(String[] args) 
	{
		C1 ob = new C1();
		System.out.println("With Short Circut && Operator");
		ob.shortCircutOperator();
		System.out.println("\n");
		System.out.println("With Normal & Operator");
		ob.normalOperator();
		
} 
}	
