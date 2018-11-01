package techSol;

public class PartTimeEmployee extends Employee{

	public double calculateSalary() {
		this.employeeSalary -= Remunerator.deductForPension(this.employeeSalary);
		return 0;
		}
	
	public double deductFoodFee() {
		
		return 0;
	}
}
