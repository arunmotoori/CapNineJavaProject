package stringhandling;

import java.util.regex.Pattern;

public class Class7 {

	public static void main(String[] args) {
		
		String str = "I love Java programming.";
		
		boolean status = Pattern.matches(".*Java.*",str);
		
		//boolean status = str.contains("Java");
		
		if(status) {
			
			System.out.println("Item found");
			
		}else {
			
			System.out.println("Item not found");
			
		}

	}

}
