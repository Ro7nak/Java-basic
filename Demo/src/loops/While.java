package loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double balance= 0,minbal = 500,depositAmt=0;
		while (depositAmt<minbal) {
			System.out.println("Enter the amount to be deposited: ");
			depositAmt = scan.nextInt();
		}
		balance = depositAmt;
		System.out.println("your deposit is successful");


	}

}
