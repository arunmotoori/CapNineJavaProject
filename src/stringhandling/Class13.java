package stringhandling;

public class Class13 {

	public static void main(String[] args) {
		
		String str1 = "Arun";
		String str2 = "arun";
		
		boolean b = str1.equals(str2);
		System.out.println(b);
		
		boolean c = str1.equalsIgnoreCase(str2);
		System.out.println(c);

	}

}
