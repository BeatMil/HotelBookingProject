package TCB001R;

import java.util.HashMap;

public class TestingTreeList {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> roomMap = new HashMap<String, Integer>();
		
		roomMap.put("Green", 1);
		roomMap.put("Blue", 2);
		roomMap.put("Red", 3);
		
		System.out.println(roomMap.get("Green"));
		
		for (Integer i : roomMap.values()) 
		{
			  System.out.println(i);
		}
		
		
	}

}
