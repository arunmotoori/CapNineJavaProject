package controlflowstatements;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			if(i==4) {
				break;
			}
			
			System.out.println(i);  // 1 2 3 
		}

	}

}
