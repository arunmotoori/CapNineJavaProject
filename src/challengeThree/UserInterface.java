package challengeThree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserInterface {

	public static void main(String[] args) {
		
		System.out.println(new UserInterface().findPetName("inputfeed.txt"));
	
	}
	
	public String findPetName(String fileName) {
		
		String petName = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			
			petName = br.readLine();
			
			while(petName!=null) {
				
				int c=0;
				
				if(petName.contains("a")) {c++;}
				
				if(petName.contains("e")) {c++;}
				
				if(petName.contains("i")) {c++;}
				
				if(petName.contains("o")) {c++;}
				
				if(petName.contains("u")) {c++;}
				
				if(c==2) {return petName;}
				
				petName = br.readLine();
				
			}
			
		}catch(FileNotFoundException e) {
			
			return "Please give the correct file name";
			
		}catch(IOException e) {
			
			return "Error occurred while reading the names from file";
			
		}
		
		return "No such pet available";
	
	}

}
