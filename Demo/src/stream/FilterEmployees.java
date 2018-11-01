package stream;

import java.util.*;
import java.util.stream.Collectors;
public class FilterEmployees {
    public static void main(String[] args) {
    
    	List <Employee> lstEmp = Employee.getEmpList();
    	
        List<Employee> lstNewEmp = lstEmp.stream().filter(emp -> emp.getYearsInOrg() < 1)
            .map(e -> { e.setSal(e.getSal() + 5000); return e; })    // Incrementing salary
            .collect(Collectors.toList());

        System.out.println("Employees less than a year old with increment:");
        lstNewEmp.forEach(e -> System.out.println(e.getId() + ":" + e.getName() + ":" + e.getSal())); 

        Optional<Double> max = lstNewEmp.stream().map(e->e.getSal())
            .reduce(Double::max);    // Finding the maximum salalry
        
        List<Employee> lstMaxEmp =  lstNewEmp.stream()
            .filter(e -> e.getSal() == max.get())    // Finding employees with the maximum salary
            .collect(Collectors.toList());

        System.out.println("\nEmployees having maximum salary after increment:");
        lstMaxEmp.forEach(e -> System.out.println(e.getId() + ":" + e.getName() + ":" + e.getSal())); 
    
    
    }
}
