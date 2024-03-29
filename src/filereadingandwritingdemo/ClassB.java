package filereadingandwritingdemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClassB {

	public static void main(String[] args) throws IOException {
		
		File folder = new File("FolderZ");
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		File file = new File(folder,"zen.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file);
		fw.write("My name is Arun Motoori.\nI am a corporate trainer at Capgemini.\nI love teaching.");
		fw.flush();
		fw.close();
		
	    FileReader fr = new FileReader(file);
	    
	    int num = fr.read();
	    
	    while(num!=-1) {
	    	System.out.print((char)num);
	    	num = fr.read();
	    }
	    
	    fr.close();
		
	}

}
