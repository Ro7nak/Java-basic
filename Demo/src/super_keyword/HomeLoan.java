package super_keyword;

public class HomeLoan extends Loan{

	public double calculateEMI(double principal) {
		int additionalTax = 200;
		double emi = super.calculateEMI(principal);
		return emi+additionalTax;
	}
	
}
