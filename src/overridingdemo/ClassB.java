package overridingdemo;

public class ClassB extends ClassA {
	
	int a = 10; 
	
	@Override
	public void sample() {
		
		System.out.println("Inside sample method of ClassB");
		
	}

}
