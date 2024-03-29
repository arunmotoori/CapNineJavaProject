package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class ClassG {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("FilesFolderOne\\Arun.txt");
		
		boolean status = file1.createNewFile();
		
		if(status) {
			System.out.println("File got created under Folder within project");
		}else {
			System.out.println("File didn't get created");
		}
		
		

	}

}
