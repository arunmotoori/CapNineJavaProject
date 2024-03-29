package twodimensionalarray;

import java.util.Arrays;

public class ClassB {

	public static void main(String[] args) {
		
		int[][] ar = {{9,5,7,1},{6,0,8,11},{13,99,4,33}};
		
		for(int i=0;i<3;i++) {  // 3
			
			for(int j=0;j<4;j++) {  // 4
				
				System.out.print(ar[i][j]+"    ");  // 9 5 7 1 6 0 8 11 13 99 4 33 
				
			}
			
			System.out.println();
			
		}

	}

}
