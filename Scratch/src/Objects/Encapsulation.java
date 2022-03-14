package Objects;
import java.util.Scanner;

class Books
		{
			 int noOfCopies;
			void library(int noOfBooks)
			{
				this.noOfCopies = noOfBooks;
				System.out.println("The NoOfCopies is :" + this.noOfCopies);
			}
			int increaseCopies(int howMuch) {
				this.noOfCopies += howMuch;
				return this.noOfCopies;
			}
		}

	public class Encapsulation {
		
		public static void main(String[] args) 
		{
			Books artOfComputerProgramming = new Books();
			Books effectiveJava = new Books();
//			Book cleanCode = new Book();
			System.out.print("Enter the Value : ");
			Scanner input = new Scanner(System.in);
			byte get = input.nextByte();
			artOfComputerProgramming.library(get);
			effectiveJava.increaseCopies(60);
			System.out.println("The noOfCopies is "+ effectiveJava.increaseCopies(get));
			input.close();
		}
}
