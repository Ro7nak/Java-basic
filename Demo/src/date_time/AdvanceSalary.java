package date_time;

import java.time.LocalDate;

class AdvanceSalary {
    private LocalDate from;
    private LocalDate to;

    public AdvanceSalary(LocalDate from,LocalDate to) {
        this.from = from;
        this.to = to;
    }
    
    public void checkDates() {
        int compare = from.compareTo(to);
        System.out.println(compare);
        // Logic that makes sure from is not greater than to
    }
}
