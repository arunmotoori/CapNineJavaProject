package privateaccessmodifier;

public class ClassM {
	
	private int a = 5;
	
	private void sampleM() {
		
		System.out.println("Inside sampleM method");
		
	}
	
	public void sampleX() {
		
		System.out.println(a);
		sampleM();
		
	}

}
