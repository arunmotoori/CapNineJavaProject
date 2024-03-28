package stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Arun");
		
		System.out.println(str); // Arun
		
		str.append(" ").append("Motoori");
		
		System.out.println(str); // Arun Motoori

	}

}
