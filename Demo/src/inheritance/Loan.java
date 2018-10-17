package inheritance;

public class Loan {

	public int tenure;
	public float interestRate;
	public double principle;
	String accountNumber;
	
	Loan(){
		System.out.println("Request for Loan");
	}
	
	public double calculateEMI() {
		double simpleInterest = (principle*interestRate*tenure)/100;
		double emi = (simpleInterest+ principle)/tenure;
		return emi;
	}
}
