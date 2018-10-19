package innerClasses;

public class Execute {

	public static void main(String[] args) {
		Manager m = new Manager();
		String empId = "I001";
		char gradePoint = m.checkEmployeeId(empId, 80);
		System.out.println("the grade for "+empId+" is "+gradePoint);

	}

}
