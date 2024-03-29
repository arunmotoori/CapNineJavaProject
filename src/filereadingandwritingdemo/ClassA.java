package filereadingandwritingdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClassA {

	public static void main(String[] args) throws IOException   {
		
		File folder1 = new File("FolderX");
		
		if(folder1.exists()) {
			System.out.println("Folder already exists. Hence not created again.");
		}else {
			folder1.mkdir();
			System.out.println("Folder got created.");
		}
		
		File file1 = new File(folder1,"sample.txt");
		
		if(file1.exists()) {
			System.out.println("File already exists. Hence not created again.");
		}else {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File got created");
		}
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file1);
			fw.write("My name is Arun Motoori.\nI love Java programming.\nI am a content creator and trainer.");
			fw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			fw.close();
		}

	}

}
