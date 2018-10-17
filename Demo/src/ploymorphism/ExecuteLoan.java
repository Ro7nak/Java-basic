package ploymorphism;

public class ExecuteLoan {

	public static void main(String[] args) {
		Loan loan = null;
		loan = new HomeLoan(); //runtime polymorphism
		double hloan = loan.calculateEMI(2000000);
		loan = new VehicleLoan();
		double vloan = loan.calculateEMI(100000);
		System.out.println("home loan emi per year is..."+hloan);
		System.out.println("vehicle loan emi per year is..."+vloan);
	}

}
