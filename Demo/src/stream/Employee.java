package stream;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	public int id;
	public String name;
	private double yearsInOrg;
	private double sal;

	public Employee(int id, String name,double sal, double yearsInOrg) {
		this.id = id;
		this.name = name;
		this.yearsInOrg = yearsInOrg;
		this.sal = sal;
	}

	public Employee(int id, String name, double yearsInOrg) {
		this.id = id;
		this.name = name;
		this.yearsInOrg = yearsInOrg;
		
	}
	
	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public void setId(int id) {
		this.id = id;
	}

	public double getYearsInOrg() {
		return yearsInOrg;
	}
	
	public void setYearsInOrg(double yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}

	public int getId() {
		return id;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<Employee> getEmpList() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "A", 200000, 20));
		list.add(new Employee(2, "B", 30000, 3));
		list.add(new Employee(3, "C", 7000, 0.7));
		list.add(new Employee(4, "D", 50000, 7));
		return list;
	}
}

