package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class ClassB {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\arunm\\Downloads\\FilesDemo\\abc.txt");
		
		boolean status = file.createNewFile();
		
		if(status) {
			System.out.println("File got created");
		}else {
			System.out.println("File didn't get created");
		}
	}

}
