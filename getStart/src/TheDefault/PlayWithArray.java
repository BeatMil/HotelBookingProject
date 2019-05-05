package TheDefault;
public class PlayWithArray {

	public static void main(String[] args) 
	{
		String[] game = {"SFV","HOTD","TK7","BBCPEX","DOD"};
		char answer = 'A';
		

		System.out.println(answer);
		for (int i = 0; i <= game.length-1; i++)
		{
			System.out.println(game[i]);
			if (i == game.length-1)
			{
				game[0] = "BR2";
				System.out.println("");
				for (String j : game)
				{
					System.out.println(j);
				}
			}
		}
		

	}

}
