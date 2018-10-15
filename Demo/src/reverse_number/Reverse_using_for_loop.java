package reverse_number;

import java.util.Scanner;

public class Reverse_using_for_loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num= scan.nextInt();
		int reverse =0;
		for (int i = num; i!=0; ) {
			int temp = i%10;
			reverse = reverse*10 + temp;
			i=i/10;
		}
		System.out.println("Reverse is :"+reverse);
	}

}
