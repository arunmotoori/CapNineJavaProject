package inheritancedemo;

public class Demo {

	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		System.out.println(ca.a);
		ca.sampleA();
		
		ClassB cb = new ClassB();
		System.out.println(cb.a);
		System.out.println(cb.b);
		cb.sampleA();
		cb.sampleB();
		
	}

}
