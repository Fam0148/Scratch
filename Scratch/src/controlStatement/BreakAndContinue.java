package controlStatement;

public class BreakAndContinue 
{
	public static void main(String[] args) 
	{
		int i=10;
		for(int j=1;j<i;j++)
		{
			if(j%2==0)
				break;
			System.out.println("Break control Statement "+j);
		}
		
		for(int j=1;j<i;j++)
		{
			if(j%2==0)
				continue;
			System.out.println(j);
		}

	}
}