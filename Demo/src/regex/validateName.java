package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateName {

	public static boolean validateName(String name) {
		Pattern regex = Pattern.compile("[A-Za-z]+\\s?");
		Matcher nameMatcher = regex.matcher(name);
		return nameMatcher.matches();
	}
	
	public static void main(String[] args) {
		System.out.println(validateName("Rounak "));
		System.out.println(validateName("Tim  "));

	}

}
