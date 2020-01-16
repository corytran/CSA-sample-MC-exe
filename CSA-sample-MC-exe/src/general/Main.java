package general;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Main {
	
	//ArrayList of file content
	public static ArrayList<String> ar = new ArrayList<String>();

	
	public static void main(String[] args)
	{ 	
		try
		{
			File file=new File("/Users/1901209/Desktop/q1.java");    //creates a new file instance  
			FileReader fr=new FileReader(file);   //reads the file  
			//ss
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream 
			
			String line; 
			
			while((line=br.readLine())!=null)  
			{  
				ar.add(line);      //appends line to string buffer
			} 
			
			//CREATE a method to check make sure that there is no error.
			for(int i = 0; i < ar.size(); i++)
			{
				System.out.println(ar.get(i));
			}
			
			fr.close();    //closes the stream and release the resources
		}
		catch(IOException e)  
		{  
			e.printStackTrace();  
		}  
		
	}
}