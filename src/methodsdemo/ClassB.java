package methodsdemo;

public class ClassB {

	public static void main(String[] args) {

		System.out.println("Inside main method");
		
		sampleA(); // Method calling statement
	
		System.out.println("End of main method");
		
	}
	
	public static void sampleA() {
		
		System.out.println("Inside sampleA method");
		sampleB();
		System.out.println("End of sampleA method");
		
	}
	
	public static void sampleB() {
		
		System.out.println("Inside sampleB method");
		sampleC();
		System.out.println("End of sampleB method");
	}
	
	public static void sampleC() {
		
		System.out.println("Inside sampleC method");
		
	}

}
