package stringhandling;

public class Class1 {

	public static void main(String[] args) {
		
		//String name1 = new String("Arun Motoori"); // Actual representation of a String
		
		String name = "Arun Motoori"; // immutable
		
		System.out.println(name.length()); //Finding the size of the String
		
		String n = name.substring(1);
		System.out.println(n);
		
		String m = name.substring(1,4);
		System.out.println(m);
		
		String o = name.substring(4,7);
		System.out.println(o);
		

	}

}
