package scannerMethod;

import java.util.Scanner;

public class Scanner_Method {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your rollno: ");
		int rollno= scan.nextInt();
		System.out.println("Enter your name: ");
		String name = scan.next();
		System.out.println("Enter your fee: ");
		double fee= scan.nextDouble();
		
		System.out.println("Rollno: "+rollno+" name: "+name+" fee: "+fee);

	}

}
