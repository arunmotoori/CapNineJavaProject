package overloadingdemo;

public class ClassB {
	
	public ClassB() {
		
		System.out.println("Inside ClassB constructor");
		
	}

	public ClassB(int a) {
		
		System.out.println("Inside ClassB Constructor:"+a);
		
	}
	
	public ClassB(double a) {
		
		System.out.println("Inside ClassB Consturctor:"+a);
		
	}
	
	public ClassB(int a,int b) {
		
		System.out.println("Inside ClassB constructor:"+a+b);
		
	}
	
	

}
