package date_time;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Demo {
	 public static void main(String[] args) {
	        Date startUtilDate = new Date();
	        // Assume that the obtained date is Thu Nov 03 20:40:45 IST 2016
	        Date tempUtilDate = startUtilDate;
	        startUtilDate.setDate(26);
	        System.out.println(tempUtilDate);
			
	        LocalDate startLocalDate = LocalDate.of(2016, Month.JUNE, 01);
	        LocalDate tempLocalDate = startLocalDate;
	        startLocalDate = startLocalDate.plusDays(10);
	        System.out.println(tempLocalDate);
	    }
}
