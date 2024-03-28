package variabletypesdemo;

public class ClassA {
	
	int d = 20;  // Global Variable
	
	public void sampleA() {
		
		int a = 5; // Local Variable
		System.out.println(a);
		System.out.println(d+2+a);
		
	}
	
	public void sampleB() {
		
		int b = 10; // Local Variable
		System.out.println(b);
		System.out.println(d+3+b);
		
	}
	
	public void sampleC() {
		
		int c = 15; // Local Variable
		System.out.println(c);
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(d+4+c);
		
	}

}
