package filehandlingdemo;

import java.io.File;

public class ClassE {

	public static void main(String[] args) {

		File file1 = new File("C:\\Users\\arunm\\Downloads\\FilesDemo\\ABC\\xyz.txt");
		
		boolean status = file1.delete();
		
		if(status) {
			System.out.println("File got deleted");
		}else {
			System.out.println("File didn't get deleted");
		}

	}

}
