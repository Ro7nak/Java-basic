package lambda;

import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {
		List<Student> studentList = Student.getStudents();
		studentList.forEach(student -> System.out.println(student));
	}

}
