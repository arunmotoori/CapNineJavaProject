package challengeSeven;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Manufacturing Date");
		String manufacturingDateInput = scanner.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		
		Date date = null;
		
		try {
			date = sdf.parse(manufacturingDateInput);
			System.out.println("Enter the Month");
			int validityMonths = scanner.nextInt();
			scanner.close();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.MONTH,validityMonths);
			Date dd = calendar.getTime();
			String calculatedDate = sdf.format(dd);
			System.out.println(calculatedDate+" is the expiry date");
		} catch (Exception e) {
			System.out.println(manufacturingDateInput+" is not a valid date");
			return;
		}
		
	}

}
