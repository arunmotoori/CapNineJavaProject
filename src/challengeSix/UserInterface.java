package challengeSix;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date");
		String userDateText = scanner.next();
		scanner.close();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		Date date = null;
		try {
			date = sdf.parse(userDateText);
			System.out.println(userDateText+" is a valid date");
		} catch (Exception e) {
			System.out.println(userDateText+" is not a valid date");
		}

	}

}
