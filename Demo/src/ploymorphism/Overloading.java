package ploymorphism;

public class Overloading {

	private float interest;
	Overloading() {
		interest = 8.5f;
	}
	
	public double calculateEMI(int tenure, double principal) {
		double simpleInterest = (principal*interest*tenure)/100;
		double emi = (simpleInterest+principal)/tenure;
		return emi;
	}
	
	public double calculateEMI(double principal, int tenure) {
		double simpleInterest = (principal*interest*tenure)/100;
		double emi = (simpleInterest+principal)/tenure;
		return emi;
	}
	public double calculateEMI(int tenure, double principal, float interest) {
		double simpleInterest = (principal*interest*tenure)/100;
		double emi = (simpleInterest+principal)/tenure;
		return emi;
	}
	
	public static void main(String[] args) {
		Overloading loan = new Overloading();
		double result = loan.calculateEMI(20000d, 5);
		double value = loan.calculateEMI(5, 20000d);
		double val = loan.calculateEMI(5, 20000, 9.5f);
		
		System.out.println("EMI per year is...."+result);
		System.out.println("EMI per year is...."+value);
		System.out.println("EMI per year is...."+val);

	}

}
