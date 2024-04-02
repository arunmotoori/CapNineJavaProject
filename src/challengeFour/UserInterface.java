package challengeFour;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter weight in kg");
		double weight = scanner.nextDouble();
		System.out.println("Enter height in cm");
		double height = scanner.nextDouble();
		scanner.close();
	
		double bmi = weight/((height/100)*(height/100));
		System.out.printf("Your BMI is %.2f",bmi);
		
		if(bmi>=25) {
			System.out.println(". You are overweight");
			double wr = bmi-25;
			System.out.printf("Reduce %.2f kg to be fit",wr);
		}else if(bmi<25 && bmi>=18.5) {
			System.out.println(". You are fit and healthy");
			
		}else if(bmi<18.5) {
			System.out.println(". You are underweight");
			double wi = 18.5-bmi;
			System.out.printf("Gain %.2f kg to be fit",wi);
		}
		

	}

}
