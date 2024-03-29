package filehandlingdemo;

import java.io.File;

public class ClassA {

	public static void main(String[] args) {
		
		File file1 = new File("C:\\Users\\arunm\\Downloads\\FilesDemo\\sample.txt");
		
		boolean status = file1.exists();
		
		if(status) {
			System.out.println("File exists");
		}else {
			System.out.println("File Not Exists");
			
		}
		
		boolean fStatus = file1.isFile();
		
		if(fStatus) {
			System.out.println("It is a file");
		}else {
			System.out.println("It is a folder");
		}
		
		boolean dStatus = file1.isDirectory();
		
		if(dStatus) {
			System.out.println("It is a directory");
		}else {
			System.out.println("It is a file");
		}

	}

}
