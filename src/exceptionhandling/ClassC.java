package exceptionhandling;

public class ClassC {

	public static void main(String[] args) {
		
		String str = null;
		
		try {
			System.out.println(str.contains("Arun"));
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");
		

	}

}
