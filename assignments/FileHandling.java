package assignments;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class FileHandling {

	public static void main(String[] args) throws IOException{
		
		FileWriter f = new FileWriter("C:\\My Files\\Notes\\external.txt");
		
		
		f.write("Hi\n");
		f.write("Hi\n");
		f.write("Hi\n");
		
		f.close();
		
		FileReader fileReader = new FileReader("C:\\My Files\\Notes\\external.txt");
	      
		int ch = fileReader.read();
		while(ch != -1) {
			System.out.print((char)ch);
			ch = fileReader.read();
		}
		fileReader.close();
	}

}
