package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		
try {
	FileInputStream fin=new FileInputStream("C:\\Users\\MSS34\\Desktop\\info.txt");
	System.out.println("File is open...");
	
	byte b = (byte) fin.read();
	
	while(b!=-1) {
		System.out.print((char) b);
		b=(byte)fin.read();
		Thread.sleep(3);
	}
	System.out.println("File is Closing...");
	fin.close();
	System.out.println("File is closed...");
	}
	
 catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
