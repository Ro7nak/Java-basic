package test_1;

import java.util.Scanner;

public class Input_from_user {

	public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double d =scan.nextDouble();
	        scan.nextLine();
	        String s = scan.nextLine();
	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }
}


/*
sample input:
42
3.1415
Welcome to HackerRank's Java tutorials!
*/