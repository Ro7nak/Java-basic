package date_time;

import java.time.LocalDate;
import java.time.Month;

public class TechSol {
	public static void main(String[] args) {
        LocalDate from = LocalDate.of(2016, Month.JUNE, 01);
        LocalDate to = LocalDate.of(2016, Month.JUNE, 03);
        AdvanceSalary advance = new AdvanceSalary(from, to);
        advance.checkDates();
    }
}
