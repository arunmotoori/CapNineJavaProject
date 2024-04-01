package filereadingandwritingdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassD {

	public static void main(String[] args) throws IOException {
		
		File folder1 = new File("FolderA");
		if(!folder1.exists()) {folder1.mkdir();}
		
		File file1 = new File(folder1,"sampleA.txt");
		if(!file1.exists()) {file1.createNewFile();}
		
		PrintWriter pw = new PrintWriter(file1);
		pw.println("My name is Arun Motoori.");
		pw.println("I love Java Programming.");
		pw.print("I create content and teach on Software Testing and Tools.");
		pw.flush();
		pw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(file1));
		String s = br.readLine();
		while(s!=null) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
		
	
	}

}
