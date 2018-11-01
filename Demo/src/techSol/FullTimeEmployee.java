package techSol;

public class FullTimeEmployee extends Employee{

	public double calculateSalary() {
		
		return 0;
	}
	
	public double deductFoodFee() {
		
		return 0;
	}
	
	public double deductHealthInsurancePrimium() {
		return (HEALTH_INSURANCE_PERCENTAGE*employeeSalary)/100;
		
	}
	
}
