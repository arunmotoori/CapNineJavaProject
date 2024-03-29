package interfacedemo;

public class HDFCBank implements Bank {

	@Override
	public void createAccount() {
		
		System.out.println("HDFCBank Account got created");
		
	}

	@Override
	public void addBeneficiary() {
		
		System.out.println("Beneficiary got added to HDFCBank");
		
	}

	@Override
	public void depositMoney() {
		
		System.out.println("Money got deposited into HDFCBank");
		
	}

	@Override
	public void transferMoney() {
		
		System.out.println("Money got transferred from HDFC Bank");
		
	}

	@Override
	public void withDrawMoney() {
		
		System.out.println("Money got withdrawn from HDFC Bank");
		
	}
	
	

}
