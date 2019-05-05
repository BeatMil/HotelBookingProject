package TheDefault;

import java.util.ArrayList;
import java.util.Arrays;

public class PlayingWithArrayList {

	public static void main(String[] args) 
	{
//		String[] game = {"HL2","UNIST"};
//		for (int i =0; i<game.length; i++)
//		{
//			System.out.println(game[i]);
//		}
//		
//		System.out.println(Arrays.toString(game));
		
		
		
		ArrayList<String> fruit = new ArrayList<String>();
		fruit.add("mango");
		fruit.add("orange");
		fruit.add("apple");		
		
		System.out.println(fruit);
		
		System.out.println(fruit.size());
		System.out.println(fruit);
		System.out.println(fruit.get(0));
		fruit.set(0, "banana");
		System.out.println(fruit.get(0));
		fruit.remove(0);
		System.out.println(fruit.get(0));

	}

}
