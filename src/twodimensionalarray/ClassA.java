package twodimensionalarray;

public class ClassA {

	public static void main(String[] args) {
		
		int[][] ar = new int[3][4];
		
		ar[0][0] = 9;
		ar[0][1] = 5;
		ar[0][2] = 7;
		ar[0][3] = 1;
		
		ar[1][0] = 6;
		ar[1][1] = 0;
		ar[1][2] = 8;
		ar[1][3] = 11;
		
		ar[2][0] = 13;
		ar[2][1] = 99;
		ar[2][2] = 4;
		ar[2][3] = 33;
		
		System.out.println(ar[0][0]);
		System.out.println(ar[0][1]);
		System.out.println(ar[0][2]);
		System.out.println(ar[0][3]);
		System.out.println(ar[1][0]);
		System.out.println(ar[1][1]);
		System.out.println(ar[1][2]);
		System.out.println(ar[1][3]);
		System.out.println(ar[2][0]);
		System.out.println(ar[2][1]);
		System.out.println(ar[2][2]);
		System.out.println(ar[2][3]);
		

	}

}
