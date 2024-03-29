package interfacedemo;

public interface Bank {
	
	String accountType1 = "Savings";
	String accountType2 = "Current";
	
	public void createAccount();
	public void addBeneficiary();
	public void depositMoney();
	public void transferMoney();
	public void withDrawMoney();
	
}
