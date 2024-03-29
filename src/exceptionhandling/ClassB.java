package exceptionhandling;

public class ClassB {

	public static void main(String[] args) {

		int a = 9, b = 0;
		
		try {
			int c = a/b;
			System.out.println(c);
		}catch(Throwable e) {
			//System.out.println("ArithmeticException got handled here");
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
