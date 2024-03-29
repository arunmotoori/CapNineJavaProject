package twodimensionalarray;

public class ClassE {

	public static void main(String[] args) {
		
		Object[][] ar = {{9.1,"Arun",7.3,1.4},{6.6,0.7,8.2,11.1},{13.1,99.6,4.5,33.2}};
		
		for(Object[] a : ar) {
			
			for(Object e : a) {
				
				System.out.print(e+"      ");
				
			}
			
			System.out.println();
			
		}

	}

}
