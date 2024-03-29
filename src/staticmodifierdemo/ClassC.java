package staticmodifierdemo;

public class ClassC {
	
	static int a = 5;
	int b = 10;
	
	public static void main(String[] args) {
		
		System.out.println(a);
		sampleC();
		
		ClassC cc = new ClassC();
		System.out.println(cc.b);
		cc.sampleD();
		
	}
	
	public static void sampleC() {
		
		System.out.println("Inside sampleC method");
		
	}
	
	public void sampleD() {
		
		System.out.println("Inside sampleD method");
		
	}

}
