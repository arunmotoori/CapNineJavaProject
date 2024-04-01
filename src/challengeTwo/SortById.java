package challengeTwo;

import java.util.Comparator;

public class SortById implements Comparator<Product>{
	
	public int compare(Product a,Product b) {
		
		return a.productid-b.productid;
		
	}

}
