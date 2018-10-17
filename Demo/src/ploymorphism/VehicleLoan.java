package ploymorphism;

public class VehicleLoan extends Loan{

	public double calculateEMI(double principal) {
		int additionalTax = 200;
		double simpleInterest = (principal * 9.5 *10)/100;
		double emi = (simpleInterest+principal)/10;
		return emi+additionalTax;
	}
}
