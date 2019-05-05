package TheDefault;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writingfile {

	public static void main(String[] args) throws IOException 
	{
		Scanner input = new Scanner(System.in);


        File file = new File("doc1.txt");
        
        if (!file.exists()) 
        {
   	     	file.createNewFile();
   	  	}
        // this code doesn't work properly for some reason
       
      
        
	    BufferedWriter out = new BufferedWriter(new FileWriter(file));
	    out.write("Tatsu.b is the best move in unist");
	    out.newLine();
	    out.append("heyyy yay");
	    out.newLine();
	    out.write("very cool");
	    
	    out.close();
	}

}
