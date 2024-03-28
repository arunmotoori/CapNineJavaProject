package javaregexdemo;

import java.util.regex.Pattern;

public class Class1 {

	public static void main(String[] args) {
		
		boolean matching = Pattern.matches("b{2,4}at","bbbbbat");
		
		if(matching) {
			
			System.out.println("matched");
			
		}else {
			
			System.out.println("Not matched");
			
		}

	}

}
