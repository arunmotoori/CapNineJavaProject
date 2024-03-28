package overridingdemo;

public class Demo {

	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		cb.sample();
		System.out.println(cb.a);
		
		ClassA ca = new ClassA();
		ca.sample();
		System.out.println(ca.a);
		

	}

}
