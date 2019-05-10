package TCB001R;

import java.util.HashMap;
import java.util.Scanner;

public class TestingTreeList {

	public static void main(String[] args) 
	{
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter int: ");
		int user_input = console.nextInt();
//		String user_string = console.nextLine();
		
		
//		System.out.println("SAY: " + user_string);
		System.out.println("NUMBER: " + user_input);
		System.out.println(String.format("NUMBER: %d", user_input));
		
		
		
		
		
		
		
		
		HashMap<String, Integer> roomMap = new HashMap<String, Integer>();
		
		roomMap.put("Green", 1);
		roomMap.put("Blue", 2);
		roomMap.put("Red", 3);
		
		System.out.println("Get the green: " + roomMap.get("Green"));
		
		for (Integer i : roomMap.values()) 
		{
			  System.out.println(i);
		}
		
		for (String i : roomMap.keySet())
		{
			System.out.println(i);
		}
		
	}

}
