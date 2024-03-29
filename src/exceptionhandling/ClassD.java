package exceptionhandling;

public class ClassD {

	public static void main(String[] args) {
		
		int[] ar = new int[3];
		
		try {
			ar[0] = 9;
			ar[1] = 5;
			ar[2] = 7;
			ar[3] = 1;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		

	}

}
