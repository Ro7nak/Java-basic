package optional;

import java.util.Optional;

public class Employee1 {
	
	private Optional<String> alternateEmail=Optional.empty();
	
	public Optional<String> getAlternateEmail() {
		return alternateEmail;
	}
	
	public void setAlternateEmail(Optional<String> alternateEmail) {
		this.alternateEmail=alternateEmail;
	}
	
}
