package challengeTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the products count");
		
		int count = scanner.nextInt();
		
		if(count<=0) {
			
			System.out.println("Invalid count");
			
		}else {
			
			System.out.println("Enter Product details");
			String[] ar = new String[count];
			
			List<Product> products = new ArrayList<Product>();
			
			for(int i=0;i<count;i++) {
			   
			   ar[i]=scanner.next();  //1006:Pen:50
			   String[] sar = ar[i].split(":");
			   int productid = Integer.parseInt(sar[0]);
			   String productName = sar[1];
			   double price = Double.parseDouble(sar[2]);
			   
			   products.add(new Product(productid,productName,price));
			   
			}
			
			System.out.println("1.Sort By Id");
			System.out.println("2.Sort By Price");
			System.out.println("Enter your choice");
			
			int choice = scanner.nextInt();
			
			if(choice==1) {
				
				SortById sbi = new SortById();	
				Collections.sort(products,sbi);
				System.out.println("After Sorting By Id");
				for(Product p : products) {
					System.out.println(p);
				}
				
			}else if(choice==2) {
				
				SortByPrice sbp = new SortByPrice();
				Collections.sort(products,sbp);
				System.out.println("After Sorting By Price");
				for(Product p : products) {
					System.out.println(p);
				}
				
			}else {
				System.out.println("Invalid choice");
			}
					
		}
		
	}

}
