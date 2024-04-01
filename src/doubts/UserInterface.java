package doubts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		UserInterface ui = new UserInterface();
		System.out.println(ui.getDuplicateElement());

	}
	
	public String getDuplicateElement() {
		
		System.out.println("Enter the size of an array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] ar;
		try {
			ar = new int[size];
		}catch(NegativeArraySizeException e) {
			return "Array size should be positive";
		}
		System.out.println("Enter the array elements");
		String rs="";
		for(int i=0;i<size;i++) {
			try {
			ar[i] = scanner.nextInt();
			rs = rs+" "+ar[i];
			}catch(InputMismatchException e) {
				return "Input was not in the correct format";
			}
		}
		System.out.println("Enter the position of the element to be replicated");
		int index = scanner.nextInt();
		try {
			int n = ar[index];
		}catch(ArrayIndexOutOfBoundsException e) {
			return "Array index is out of range";
		}
	
		return "The array elements are"+rs+" "+ar[index];
		
	}
	
	

}
