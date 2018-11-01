package lambda;

import java.util.ArrayList;
import java.util.List;

public class TechSolLuckyDraw {
    public static void main(String[] args) {
    	List<Integer> lstEmpIds = new ArrayList<>(); 
    	lstEmpIds.add(701564);
    	lstEmpIds.add(342);
    	lstEmpIds.add(5654);
    	lstEmpIds.add(6001);
    	lstEmpIds.add(693455);
        printEvenIds(lstEmpIds);
        printOddIds(lstEmpIds);
        printIdsForStock(lstEmpIds);
    }

    public static void printEvenIds(List<Integer> lstEmpIds) {
        for(int id : lstEmpIds) {
            if(id % 2 == 0) System.out.println("Even Employee Id: " + id);
        }
    }

    public static void printOddIds(List<Integer> lstEmpIds) {
        for(int id : lstEmpIds) {
            if(id % 2 != 0) System.out.println("Odd Employee Id: " + id);
        }
    }

    public static void printIdsForStock(List<Integer> lstEmpIds) {
        for(int id : lstEmpIds) {
            if(id < 1500) System.out.println("Employee Id less than 1500: " + id);
        }
    }
}