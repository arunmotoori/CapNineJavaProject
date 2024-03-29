package staticmodifierdemo;

public class ClassD {
	
	int a = 5; // Instance Global Variable
	static int b = 10; // static Global Variable
	
	public void sampleD() {
		
		System.out.println(a);
		System.out.println(b);
		sampleA();
		sampleB();
		
	}
	
	public static void sampleA() {
		
		System.out.println("Inside sampleA");
		
	}
	
	public void sampleB() {
		
		System.out.println("Inside sampleB");
		
	}

}
