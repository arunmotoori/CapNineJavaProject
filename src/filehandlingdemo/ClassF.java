package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class ClassF {

	public static void main(String[] args) throws IOException {
		
		File folder1 = new File("FilesFolderOne");
		
		if(folder1.exists()) {
			
			System.out.println("Folder already exists in this project. Hence not created.");
			
		}else {
			boolean status = folder1.mkdir();
			
			if(status) {
				System.out.println("Folder got created under this project.");
			}else {
				System.out.println("Folder didn't get created under this project.");
			}
		}
		
		File file2 = new File(folder1,"Motoori.txt");
		
		if(file2.exists()) {
			System.out.println("File already exists. hence not created again.");
		}else {
			boolean status = file2.createNewFile();
			
			if(status) {
				System.out.println("File got created");
			}else {
				System.out.println("File didn't get created");
			}
		}

	}

}
