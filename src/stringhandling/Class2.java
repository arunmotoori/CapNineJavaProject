package stringhandling;

import java.util.Date;

public class Class2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		String originalDate = date.toString();
		System.out.println(originalDate);
		
		String noSpaces = originalDate.replace(" ","_");
		System.out.println(noSpaces);
		
		String noColonsAndSpaces = noSpaces.replace(":","_");
		System.out.println(noColonsAndSpaces);
		
		//String fileName = noColonsAndSpaces.concat(".png");
		String fileName = noColonsAndSpaces+".png";
		System.out.println(fileName);

	}

}
