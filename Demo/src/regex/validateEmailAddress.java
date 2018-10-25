package regex;

public class validateEmailAddress {

	public static boolean validateEmailId(String emailId) {
		if(emailId.matches("[a-zA-Z0-9]+(\\._)?[\\w]+@{1}[A-Za-z0-9]+\\.[a-zA-Z]{2,3}+\\.?[a-zA-Z]{0,3}"))
			return true;
	return false;
	}
	
	public static void main(String[] args) {
		System.out.println(validateEmailId("TomJerry1@domain.com"));
		System.out.println(validateEmailId("Tom@Jerry@tom.com"));
		System.out.println(validateEmailId("Tom1&Jerry@tom.com"));
		System.out.println(validateEmailId("rounak@gmail.co.in"));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		

	}

}
