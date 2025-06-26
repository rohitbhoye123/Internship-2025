package Day17;
import java.io.*;

import java.io.BufferedReader;

public class ReadMissingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("nonexistent.txt"));
			
			String line=reader.readLine();
			
			System.out.println("File content:"+line);
			
		}catch(IOException e) {
			
			System.out.println("IOException occured:"+e.getMessage());
		}
	}

}
