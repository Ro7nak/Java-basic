package test;

public class Account {
	
	private double balance = 500.00;
	
	public double getBalance(int accountId) {
		
		return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		double value = acc.getBalance(123456);
		System.out.println("the Balance is.."+value);

	}

}
