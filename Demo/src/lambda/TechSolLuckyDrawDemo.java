package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TechSolLuckyDrawDemo {

	public static void main(String[] args) {
        // lstEmpIds is the populated list of employee ids
		List<Integer> lstEmpIds = new ArrayList<>(); 
    	lstEmpIds.add(701564);
    	lstEmpIds.add(342);
    	lstEmpIds.add(5654);
    	lstEmpIds.add(6001);
    	lstEmpIds.add(693455);
        System.out.println("Printing Even Employee Ids");
        evaluate(lstEmpIds, (n) -> n % 2 == 0);
        System.out.println("Printing Odd Employee Ids");
        evaluate(lstEmpIds, (n) -> n % 2 == 1);
        System.out.println("Printing Employee Ids less than 1500");
        evaluate(lstEmpIds, (n) -> n < 1500);
    }

    public static void evaluate(List<Integer> lstEmpId, Predicate<Integer> predicate) {
        for(int id : lstEmpId) {
            if(predicate.test(id))
                System.out.println(id);
        }
    }
	
}
