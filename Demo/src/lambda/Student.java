package lambda;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private int marks;

	public Student(String name, int age, int marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public static List<Student> getStudents() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("James", 55, 100));
		list.add(new Student("Jack", 45, 90));
		list.add(new Student("Jeff", 35, 95));
		list.add(new Student("Jonathan", 50, 100));
		list.add(new Student("John", 25, 90));
		return list;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
}
