package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeStarter {
    public static void main(String[] args) {
        // Code to retrieve full-time employees and to store them in a list called employeesList
		
        List<Integer> passportNumbers = new ArrayList<>();    // List to collect the passport numbers
        for(FullTimeEmployee employee : employeesList) {
            Optional<Employee> optEmp = Optional.of(employee);
            passportNumbers.add(optEmp.flatMap(Employee::getPassport).map(Passport::getPassportNumber).orElse(0));
        }
    }
}
