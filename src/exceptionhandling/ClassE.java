package exceptionhandling;

public class ClassE {

	public static void main(String[] args) {
		
		String str = null;
		
		try {
			boolean b = str.contains("Arun");
			System.out.println(b);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException got handled");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException got handled here");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException got handled here");
		}catch(Exception e) {
			System.out.println("Exception got handled here");
		}catch(Throwable e) {
			System.out.println("Throwable got handled here");
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
	

	}

}
