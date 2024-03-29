package filehandlingdemo;

import java.io.File;

public class ClassC {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\arunm\\Downloads\\FilesDemo\\ABC");
		boolean status = file.mkdir();
		if(status) {
			System.out.println("Folder got created");
		}else {
			System.out.println("Folder didn't get created");
		}
	}

}
