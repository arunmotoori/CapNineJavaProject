package filereadingandwritingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassE {

	public static void main(String[] args) throws IOException {
		
		File folder1 = new File("FolderB");
		if(!folder1.exists()) {folder1.mkdir();}
		File file1 = new File(folder1,"sampleB.txt");
		if(!file1.exists()) {file1.createNewFile();}
		
		FileOutputStream fos = new FileOutputStream(file1);
		String s = "My name is Arun Motoori.\nI love Java Programming.\nI create content and teach on Software Testing.";
		fos.write(s.getBytes());
		fos.flush();
		
		FileInputStream fis = new FileInputStream(file1);
		int n = fis.read();
		while(n!=-1) {
			System.out.print((char)n);
			n = fis.read();
		}
		
	   
	}

}
