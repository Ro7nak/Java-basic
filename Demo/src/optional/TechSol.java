package optional;

import java.util.Optional;

public class TechSol {
	public static void main(String[] args) {
		Employee employee=new Employee(Optional.of(new String("John@abc.com")));
		System.out.println(employee.getAlternateEmail().isPresent());
	}
}
