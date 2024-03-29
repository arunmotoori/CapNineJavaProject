package staticmodifierdemo;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(ClassB.b);
		System.out.println(ClassB.a);
		ClassB.methodB();
		ClassB.methodA();

	}

}
