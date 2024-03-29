package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class ClassD {

	public static void main(String[] args) throws IOException {
		
		File folder1 = new File("C:\\Users\\arunm\\Downloads\\FilesDemo\\ABC");
		
		File file1 = new File(folder1,"xyz.txt");
		
		boolean status = file1.createNewFile();
		
		if(status) {
			System.out.println("File got created");
		}else {
			System.out.println("File didn't get created");
		}

	}

}
