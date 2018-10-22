package calendar_method;


import java.util.Calendar;
import java.util.Date;

public class AgeFinder {

	int getAge(Calendar dateOfBirth) {
		Calendar today = Calendar.getInstance();
		int yeardiff = today.get(Calendar.YEAR)-dateOfBirth.get(Calendar.YEAR);
		int mondiff = today.get(Calendar.MONTH)-dateOfBirth.get(Calendar.MONTH);
		int daydiff = today.get(Calendar.DATE)-dateOfBirth.get(Calendar.DATE);
		if (mondiff<0){
			yeardiff--;
		}
		return yeardiff;
	}
	
	Date getDateAfterNDays(int noOfDays) {
		Calendar t = Calendar.getInstance();
		t.add(Calendar.DATE, noOfDays);
		return t.getTime();
	}
	
	Calendar getDateAfterXYearsYMonthZDays(int year,int month, int day) {
		Calendar t = Calendar.getInstance();
		t.add(Calendar.DATE, day);
		t.add(Calendar.MONTH, month);
		t.add(Calendar.YEAR, year);
		return t;
	}
	
	public static void main(String[] args) {
		AgeFinder af = new AgeFinder();
		Calendar birth = Calendar.getInstance();
		birth.set(1993, 9, 22);
		System.out.println(af.getAge(birth));
		System.out.println(af.getDateAfterXYearsYMonthZDays(1, 2, 3).getTime());
		System.out.println(af.getDateAfterNDays(25));
	}
	
}
