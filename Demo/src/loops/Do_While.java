package loops;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double balance= 0,minbal = 500,depositAmt=0;
		do {
			System.out.println("Enter the amount to be deposited: ");
			depositAmt = scan.nextInt();
		}while(depositAmt<minbal);
		balance = depositAmt;
		System.out.println("your deposit is successful");

	}

}
