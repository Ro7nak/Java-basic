package inheritance;

public class PermanentEmployee extends Employee{

	protected double basicPay;
	protected double hra;
	protected int experience;
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void calculateSalary() {
		double variablePay;
		if(experience<3)
			variablePay = 0;
		else if(experience>=3 && experience<5)
			variablePay = basicPay*5/100;
		else if(experience>=5 && experience<10)
			variablePay = basicPay*7/100;
		else
			variablePay = basicPay*12/100;
		
		salary = variablePay+basicPay+hra;
	}
}
