package super_keyword;

public class ExecuteLoan {

	public static void main(String[] args) {
		Loan loan = null;
		loan = new HomeLoan();
		double hloan = loan.calculateEMI(2000000);
		System.out.println("Home loan emi per year..."+hloan);

	}

}
