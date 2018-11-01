package period;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeService {
    public static long calculateLOPs(LocalDate startDateLOP, LocalDate endDateLOP) {
        Period period = Period.between(startDateLOP, endDateLOP);
        int lops = period.getDays();
        return lops + 1;
    }

    // Other fields and methods
}
