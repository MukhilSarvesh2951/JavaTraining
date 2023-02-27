package Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("new.txt",true);
			String str="Hi this is the written context...";
			byte barry[]=str.getBytes();
			System.out.println("String is converted to bytes");
			fout.write(barry);
			System.out.println("Array is written to te file");
			fout.close();
			System.out.println("File is closed...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
