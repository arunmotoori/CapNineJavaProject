package interfacedemo;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(HDFCBank.accountType1);
		System.out.println(HDFCBank.accountType2);
		
		HDFCBank h = new HDFCBank();
		h.createAccount();
		h.addBeneficiary();
		h.depositMoney();
		h.transferMoney();
		h.withDrawMoney();
		
		
		

	}

}
