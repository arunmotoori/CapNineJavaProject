package controlflowstatements;

public class IfElseIfElseDemo {

	public static void main(String[] args) {
		
		int a = 9, b = 7, c = 3, d = 4, e = 2;
		
		if(a<b) {
			
			System.out.println("a is less than b");
			
		} else if(b<c) {
			
			System.out.println("b is less than c");
			
		} else if(c<d) {
			
			System.out.println("c is less than d");
			
		} else if(d<e) {
			
			System.out.println("d is less than e");
			
		} else {
			
			System.out.println("e is the least");
			
		}

	}

}
