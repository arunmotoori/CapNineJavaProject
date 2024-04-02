package challengeFive;

public class UserInterface {

	public static void main(String[] args) {
		
		int n1 = addition(10,15);
		System.out.println("Total "+n1);
		int n2 = addition(10,20,30);
		System.out.println("Total "+n2);
		int n3 = addition(10,30,60,100,5,15);
		System.out.println("Total "+n3);

	}
	
	public static int addition(int... a) {
		
		int sum = 0;
		System.out.println("Number of arguments is "+a.length);
		
		for(int e : a) {
			sum = sum + e;
		}
		
		return sum;
				
	}
}
