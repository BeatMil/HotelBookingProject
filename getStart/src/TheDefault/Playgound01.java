package TheDefault;
import java.util.Scanner;

public class Playgound01 
{

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		String myFavChar[] = {"Ryu", "Bob","Bang","Makoto"};
		int choosenChar;
		
//		for (String i : myFavChar)
//		{
//			System.out.print(i);
//		}
//		printing whole array	
		System.out.println("Character Select:");
		
		for (int i = 0; i < myFavChar.length; i++)
		{
			System.out.print(i+1+"." + myFavChar[i]+" ");
			
			if (i == myFavChar.length-1)
			{
				System.out.println();
			}
		}
		
		while (true)
		if (console.hasNextInt())
		{
			
			choosenChar = console.nextInt();
			if (choosenChar > 4 || choosenChar <= 0)
			{	
				System.out.println("The number is not in the list.");
			}
			else 
			{
				break;
			}
			
			
		}
		else
		{
			System.out.println("please try again.");
			console.next();
		}
		
		System.out.println(myFavChar[choosenChar-1]);
		
		

		

		
	}
	
	
	


}
