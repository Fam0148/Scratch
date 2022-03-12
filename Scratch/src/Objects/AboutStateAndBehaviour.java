package Objects;

	class Prints
	{	
		void print(String name)
		{
			System.out.println(name);
		}
	}

public class AboutStateAndBehaviour 
{
	public static void main(String[] args) 
	{
		Prints object = new Prints(); // Methods can be Access only with a Objects.
		object.print("SUBASH"); // Here a Object is object we created with Class name Prints, We Access print method using the object.
	}
}
