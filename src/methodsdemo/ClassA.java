package methodsdemo;

public class ClassA {
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		sampleA(); //Method calling statement
		
		System.out.println("End of main method");
	}
	

	public static void sampleA() {
		
		System.out.println("Inside sampleA");

		sampleB();
		
		System.out.println("End of sampleA");
	}
	
	public static void sampleB() {
		
		System.out.println("Inside sampleB");
		
	}

}
