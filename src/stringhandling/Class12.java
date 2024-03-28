package stringhandling;

public class Class12 {

	public static void main(String[] args) {
		
		String a = new String("Arun");
		String b = new String("Varun");
		String c = new String("Arun");
		
		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // true
		System.out.println(a==b); // false
		System.out.println(a==c); // false
		

	}

}
