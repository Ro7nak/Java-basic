package inheritance;

public class EmployeeRecords {

	public static void main(String[] args) {
		PermanentEmployee pe = new PermanentEmployee();
		ContractEmployee ce = new ContractEmployee();
		pe.setName("Anil");
		pe.setEmpId(101);
		pe.setBasicPay(10000);
		pe.setHra(1500);
		pe.setExperience(3);
		pe.calculateSalary();
		System.out.println("Permanent Employee: your salary is: "+pe.getSalary());
		
		ce.setName("Ankit");
		ce.setEmpId(102);
		ce.setWages(500);
		ce.setHours(10);
		ce.calculateSalary();
		System.out.println("Contract Employee: your salary is: "+ce.getSalary());
	}

}
