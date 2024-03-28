package stringhandling;

public class Class15 {
	
	public static void main(String[] args) {
		
		String str = "My name is Arun Motoori";
		
		boolean a = str.startsWith("My");
		System.out.println(a);
		
		boolean b = str.startsWith("name");
		System.out.println(b);
		
		boolean c = str.endsWith("Motoori");
		System.out.println(c);
		
		boolean d = str.endsWith("Arun");
		System.out.println(d);
		
	}

}
