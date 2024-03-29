package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ClassH {

	public static void main(String[] args) throws FileNotFoundException{
		
		
		File file = new File("xyz.txt");
		FileInputStream fis = new FileInputStream(file);
		
		System.out.println("End of this program.");
		System.out.println("End of this program.");
		System.out.println("End of this program.");
		System.out.println("End of this program.");

	}

}
