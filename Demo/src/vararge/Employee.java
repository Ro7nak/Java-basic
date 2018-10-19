package vararge;

public class Employee {

	private String employeeId;
	
	public Employee(String employeeId) {
		this.employeeId = employeeId;
	}
	

public int reward(double... fixedDeposit) {
	double sum =0 ;
	int rewardPoint = 0;
	for (double d : fixedDeposit) {
		sum += d;
	}
	if (sum>1000000)
		rewardPoint = 20000;
	else if(sum <1000000 && sum >= 500000)
		rewardPoint = 10000;
	else
		rewardPoint = 0;
	return rewardPoint;
}

public String getEmployeeId() {
	return employeeId;
}

public static void main(String[] args) {
	Employee emp = new Employee("E001");
	int rewardPoint = emp.reward(100000, 200000, 300000);
	Employee emp2 = new Employee("E002");
	int rewardPoint2 = emp2.reward(100000, 1000000);
	
	System.out.println(emp.getEmployeeId()+" has got a reward of "+rewardPoint);
	System.out.println(emp2.getEmployeeId()+" has got a reward of "+rewardPoint2);
}

}