package date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class EmployeeService {
	
	public static void generatePaySlip() {
        // Code for generating pay slip
        Date paySlipDate = new Date();
        System.out.println(paySlipDate);    // Output will be: Fri Nov 18 11:04:52 IST 2016
    }
	
//	@SuppressWarnings("deprecation")
//	public void generatePaySlipNew() {			
//	    Date paySlipDate = new Date();
//	    paySlipDate.setDate(9);             // Notice these methods are obsolete
//	    paySlipDate.setMonth(11);
//	    paySlipDate.setYear(2016);
//	    System.out.println(paySlipDate);    // Output will be: Sat Dec 09 11:16:06 IST 3916
//	}
	
	public void generatePaySlipNew() throws ParseException {			
        LocalDate paySlipDate = LocalDate.of(2016, Month.NOVEMBER, 9);
        SimpleDateFormat s = new SimpleDateFormat("dd/mm/yyyy");
        Date temp = new Date();
        temp = s.parse(paySlipDate.toString());
        System.out.println(temp); 
    }
	
	 public static long calculateLOPs(String startDateLOP, String endDateLOP) throws ParseException {
	        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	        Date start = format.parse(startDateLOP);
	        Date end = format.parse(endDateLOP);
	        long diff = end.getTime() - start.getTime();    // Difference in milliseconds
	        long lops = diff / (24 * 60 * 60 * 1000);       // Converting milliseconds to days
	        return lops + 1;
	    }

}
