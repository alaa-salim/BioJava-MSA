import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
	int count;
	String[] array = new String[5];

	public File() 
	{
		
	}
	
	public String[] readFile()
	{

		try 
		{
			count = 0;
			boolean eof = false;
			FileReader file = new FileReader("/Users/Al/Desktop/SEQUENCES.txt"); //insert file path here
			BufferedReader buffer = new BufferedReader(file);
			String temp = null;
			while(!eof)
			{
				temp = buffer.readLine();
				if(temp == null)
				{
					eof = true;
				}
				else
				{
					array[count] = temp;
					count++;
				}
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return array;
	}

	public int getCount() {
		return count;
	}

}
