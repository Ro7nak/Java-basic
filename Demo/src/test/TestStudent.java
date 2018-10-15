package test;

public class TestStudent {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Jacob");
		s.setStudentId(1001);
		s.setQualifyingExamMarks(80);
		s.setResidentialStatus('H');
		s.setYearOfEngg(3);
		
		System.out.println("******************Student Information ************************");
		System.out.println("Student Name: " +s.getName());
		
		

	}

}
