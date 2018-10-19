package innerClasses;

public class Manager {

	private class Grade{
		private char grade;
		private char calculateGrade(String employeeId, int point) {
			if(isEmployeeExists(employeeId)) {
				if(point<100 && point >=90)
					grade = 'A';
				else if(point <90 && point >=80)
					grade = 'B';
				else
					grade = 'C';
			}
			return grade;
		}
		private boolean isEmployeeExists(String employeeId) {
			return true;
		}
	}
	
	public char checkEmployeeId(String employeeId, int point) {
		Grade grade = new Grade();
		return grade.calculateGrade(employeeId, point);
	}
}
