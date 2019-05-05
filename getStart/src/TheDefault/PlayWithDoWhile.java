package TheDefault;
import java.util.Scanner;

public class PlayWithDoWhile {

	public static void main(String[] args) 
	{
		
		
		Scanner console = new Scanner(System.in);
		int x = 1 ;
		String input;
		
		String[] number = {"1","2","3","4","5","6","7","8","9","0"};
		System.out.println(number[0]);
		
		do
		{
			System.out.print("Create password: ");
			input = console.nextLine();
			if (input.length() <= 7)
			{
				System.out.println("Error: Password needs to be atleast 8 letters.");
			}
		}
		while (input.length() <=7);
		input.contains("5");
				
			

	}

}

