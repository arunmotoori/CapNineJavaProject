package challengeTwo;

public class Product {
	
	public int productid;
	public String productName;
	public double price;
	
	public Product(int productid,String productName,double price) {
		
		this.productid = productid;
		this.productName = productName;
		this.price = price;
		
	}
	
	public String toString() {
		
		return productid+" "+productName+" "+price;
		
	}

}
