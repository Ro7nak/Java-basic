package period;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Demo {
	
	 
	  
		public static void main(String[] args) {
		       Period period = Period.of(1, 5, 2001);
		       System.out.println(period.getDays() + "\t" + period.getMonths());
		
		       LocalDate paySlipDate = LocalDate.now();
		       System.out.println(paySlipDate);                                             // Output: 2016-11-21
		       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		       System.out.println(paySlipDate.format(formatter));                           // Output: 21/Nov/2016
		
		       
		       
		}
	
}
