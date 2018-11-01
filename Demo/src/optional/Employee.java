package optional;

import java.util.Optional;

public class Employee {
	private Optional<String> alternateEmail;
	public Optional<String> getAlternateEmail() {
		return alternateEmail;
	}
	public Employee(Optional<String> alternateEmail) {
		this.alternateEmail=alternateEmail;
	}
}
