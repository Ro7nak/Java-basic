package techSol;

public interface Remunerator {

	public abstract double deductFoodFee();
	public final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
	final double PENSION_PERCENTAGE = 5.0;
    public default double deductHealthInsurancePremium() {  // Need not be overridden
		return 0;    
        // Default implementation which can be redefined
    }
    public static double deductForPension(double employeeSalary) {    // Static method of the interface
		return (employeeSalary * PENSION_PERCENTAGE / 100);
    }
}
