package optional;

import java.util.Optional;

public class TechSol1 {
	public static void main(String[] args) {
		Employee1 employee1=new Employee1();
		Employee1 employee2=new Employee1();
		employee1.setAlternateEmail(Optional.of("John@abc.com"));
		System.out.println(employee1.getAlternateEmail().orElse("def@abc.com"));
		System.out.println(employee2.getAlternateEmail().orElse("def@abc.com"));
	}
}
