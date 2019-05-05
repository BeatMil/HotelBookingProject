package TheDefault;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) 
	{
		// input
		Scanner console = new Scanner (System.in); 
		
		// Variables
		int guess=500;
		int max=1001;
		int min=0;
		String input;
			
		
		System.out.println("Number guessing Game. \nPlease choose number between 1 and 1000.");
		System.out.println(guess);		
		
		
		do {
			System.out.println("Higher[h] or Lower[l]?? Correct[c]");
			input = console.nextLine();
			System.out.println();
			
			
			if (input.equalsIgnoreCase("L"))
			{				
				max = guess;
				guess= (max+min)/2;
				System.out.println(guess);
			}
			else if (input.equalsIgnoreCase("H"))
			{
				min = guess;
				guess= (max+min)/2;
				System.out.println(guess);
			}
			else
			{
				System.out.println("Please type One letter.");
				System.out.println(guess);
			}
			
			
		} while (!input.equalsIgnoreCase("c"));
						
		System.out.println("I knew it!\nYour guess number is " + guess);
		
		
		
	}
	
	
}
