package stringhandling;

public class Class11 {

	public static void main(String[] args) {
		
		String a = "Arun";
		String b = "Varun";
		String c = "Arun";
		
		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // true
		System.out.println(a==b); // false
		System.out.println(a==c); // true

	}

}
