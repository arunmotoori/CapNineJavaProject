package overloadingdemo;

public class ClassA {
	
	public void sampleA() {
		
		System.out.println("Inside sampleA method");
		
	}
	
	public void sampleA(int a) {
		
		System.out.println("Inside sampleA method: "+a);
		
	}
	
	public void sampleA(double a) {
		
		System.out.println("Inside sampleA method: "+a);
		
	}
	
	public void sampleA(int a,int b) {
		
		System.out.println("Inside sampleA method: "+a+b);
		
	}
	

}
