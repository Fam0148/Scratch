package Objects;
import java.util.Scanner;
class Book
		{
			private int noOfCopies;
			
			void library(int noOfBooks)
			{
				this.noOfCopies = noOfBooks;
				System.out.println("The NoOfCopies is :" + this.noOfCopies);
			}
		}

	public class Exercise1inOops 
{
		public static void main(String[] args) 
		{
			Book artOfComputerProgramming = new Book();
//			Book effectiveJava = new Book();
//			Book cleanCode = new Book();
			System.out.print("Enter the Value : ");
			 Scanner input = new Scanner(System.in);
			 byte get = input.nextByte();
			 
			artOfComputerProgramming.library(get);
			input.close();
		}
}
