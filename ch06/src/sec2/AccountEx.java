package sec2;

public class AccountEx {

	public static void main(String[] args) {
		
		Account acc= new Account();
		
		acc.setNumber("111-11111-11111");
		acc.setName("김지훈");
		acc.setB(150000);
		acc.runDeposit();
		acc.setB(90000);
		acc.runWithdraw();
		acc.runBalance();
		System.out.println();
		acc.printAccount();

	}

}
