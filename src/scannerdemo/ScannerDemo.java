package scannerdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter any integer number:");
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		
		try {
			a = scanner.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException got handled here");
		}
		
		System.out.println("You have successfully entered: "+a);

	}

}
