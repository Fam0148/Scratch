package String;

public class MoreString 
{
	public static void main(String[] args) 
	{
		String name = "SUBASH";
		System.out.println(name.concat(" Learning Java"));
		System.out.println(name);
		name.toUpperCase(); // It doesn't affect the String, Because the String is Immutable, it always Stores in some instance.
		String name2 = name.toLowerCase();
		System.out.println(name2);
	}
}
