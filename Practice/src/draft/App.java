package draft;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
	public static void main(String[] args) {
		String s1 = "Bharath";
		String s2 = "rath";
		String s3 = "Bha" + s2;
		String s4 = "Bha" + "rath";
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s3));
		
		String s11 = "Alpha", s22 = "Beta", s33 = "Theta";
		s11.toLowerCase();
		s33.replace("Beta", "Alpha");
		System.out.print((s11.equals(s22)) + "," + (s22.equals(s33)));

			LocalDateTime dateTime=LocalDateTime.of(2018, 04,20,15,35,32);
			DateTimeFormatter formatterPattern=DateTimeFormatter.ofPattern("dd-m-yyyy");
			String str=dateTime.format(formatterPattern);
			System.out.println(str);
		
			}
}
