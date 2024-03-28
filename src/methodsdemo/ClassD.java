package methodsdemo;

public class ClassD {

	public static void main(String[] args) {
		
		add(5,4);
		int r = addThree(1,2,3);
		System.out.println(r);
		
	}
	
	public static void add(int a,int b) {  // void - nothing
		
		int sum = a+b;
		System.out.println(sum);
		
	}
	
	public static int addThree(int a,int b,int c) {
		
		int d = a+b+c;
		
		return d;
		
	}

}
