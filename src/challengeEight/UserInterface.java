package challengeEight;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Add number");
		System.out.println("2.Find average");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		
		NumAvg nAvg = new NumAvg();
		
		while(choice!=3) {
			
			if(choice==1) {
				System.out.println("Enter the number");
				int number = scanner.nextInt();
				nAvg.addNum(number);
			}else if(choice==2) {
				if(!(nAvg.calAvg()==0.0)) {
				   System.out.println(nAvg.calAvg());
				}else {
					System.out.println("The set is empty");
				}
			}
			
			System.out.println("1.Add number");
			System.out.println("2.Find average");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			
		}
		scanner.close();
		System.out.println("Thank you for using the application");
	}

}
