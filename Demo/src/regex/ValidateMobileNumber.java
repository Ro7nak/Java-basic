package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNumber {
	
	public static boolean validateMobileNumber(String mobileNumber) {
		Pattern regex = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher mobileMatcher = regex.matcher(mobileNumber);
		return mobileMatcher.matches();
	}
	
	public boolean validateSSNNumber(String ssnNumber) {
		if(ssnNumber.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}")) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// method is static and hence can be used without reference of the class
		System.out.println(validateMobileNumber("12-134-5555"));
		ValidateMobileNumber v = new ValidateMobileNumber();
		System.out.println(v.validateSSNNumber("121-45-2345"));
		System.out.println(v.validateMobileNumber("123-654-5555"));
	}

}
