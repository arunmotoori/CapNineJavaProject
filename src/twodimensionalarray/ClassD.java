package twodimensionalarray;

public class ClassD {

	public static void main(String[] args) {
		
		int[][] ar = {{9,5,7,1},{6,0,8,11},{13,99,4,33}};
		
		for(int[] a : ar) {
			
			for(int e : a) {
				
				System.out.print(e+"      ");
				
			}
			
			System.out.println();
			
		}

	}

}
