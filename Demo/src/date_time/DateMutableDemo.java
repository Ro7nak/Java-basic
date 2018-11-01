package date_time;

import java.time.LocalDate;

public class DateMutableDemo {

	public static void main(String[] args) {
		Employee e = new Employee(1001, "Rounak");
		System.out.println(e.getDtJoining());
		e.dtJoining.setDate(78);
		System.out.println(e.getDtJoining());
		
		 LocalDate paySlipDate = LocalDate.now();
	        System.out.println(paySlipDate);      
	        
	     LocalDate registrationDate = LocalDate.now();
	     LocalDate lastDate = registrationDate.plusDays(3);    // Adding 3 days to the registration date
	        //Now lastDate has to be checked against the current date every day, and if the current date crosses lastDate, reminder mail has to be triggered.
	     if(LocalDate.now().isAfter(lastDate)) {               // Checking whether current date is after the last date
	         System.out.println("Please take the assessment as soon as possible");
	        }
	}
}
