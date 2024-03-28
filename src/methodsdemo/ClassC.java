package methodsdemo;

public class ClassC {

	public static void main(String[] args) {
		
		sayHello(); // No Arguments
		welcomeUser("Arun"); // 1 Argument
		addNumbers(5,4); // 2 Argument
		addThreeNumbers(5,1.25,1); // 3 Argument
	}
	
	public static void sayHello() {
		
		System.out.println("Hello!");
		
	}
	
	public static void welcomeUser(String name) {  // 1 parameter
		
		System.out.println("Welcome: "+name);
		
	}
	
	public static void addNumbers(int a,int b) {  // 2 parameters
		
		System.out.println(a+b);
		
	}
	
	public static void addThreeNumbers(int a,double b,int c) {
		
		System.out.println(a+b+c);
	}

}
