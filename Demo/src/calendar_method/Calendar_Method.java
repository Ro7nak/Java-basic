package calendar_method;

import java.util.Calendar;

public class Calendar_Method {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH)+1;
		int year = cal.get(Calendar.YEAR);
		int time = cal.get(Calendar.HOUR);
		
		System.out.println("Today is..."+date+"/"+month+"/"+year+", "+time);
		
		System.out.println("Current date is "+cal.getTime());
		cal.set(1992, 0, 1);
		System.out.println("date after modification "+cal.getTime());
		cal.add(Calendar.MONTH, 3);
		System.out.println("date after adding 3 months "+cal.getTime());
		cal.add(Calendar.YEAR, -3);
		System.out.println("date after subtracting 3 years "+cal.getTime());

	}

}
