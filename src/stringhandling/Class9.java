package stringhandling;

public class Class9 {

	public static void main(String[] args) {
		
		String str = "I love Java Programming.";
		
		int i = str.indexOf("Java");
		
		if(i==-1) {
			System.out.println("Item not found");
		}else {
			System.out.println("Item found");
		}

	}

}
