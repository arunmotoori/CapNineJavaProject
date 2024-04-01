package filereadingandwritingdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassC {

	public static void main(String[] args) throws IOException {
		
		File folder1 = new File("FolderY");
		if(!folder1.exists()) {	folder1.mkdir();}
		File file1 = new File(folder1,"sample.txt");
		if(!file1.exists()) {file1.createNewFile();}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
		bw.write("My name is Arun Motoori.");
		bw.newLine();
		bw.write("I love Java Programming.");
		bw.newLine();
		bw.write("I create content and teach on Software Testing and Tools.");
		bw.flush();
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader(file1));
		String s = br.readLine();
		
		while(s!=null) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
		
	}

}
