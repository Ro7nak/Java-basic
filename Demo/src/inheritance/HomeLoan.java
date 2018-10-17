package inheritance;

public class HomeLoan extends Loan{
	HomeLoan() {
		System.out.println("Request for Home Loan");
		tenure = 5;
		principle = 20000;
		interestRate = 8.5f;
		accountNumber = "Acc12345";
	}
	
	public static void main(String[] args) {
		HomeLoan h = new HomeLoan();
		double amount = h.calculateEMI();
		System.out.println("EMI per year is.."+amount);
	}
}
