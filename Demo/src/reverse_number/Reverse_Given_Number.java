package reverse_number;

import java.util.Scanner;

public class Reverse_Given_Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to be reversed: ");
		int num = scan.nextInt();
		int num2 = num;
		int reverse =0;
		while(num !=0) {
			int temp = num%10;
			reverse = reverse*10 + temp;
			num = num/10;
		}
		System.out.println("Reverse of the number "+num2+" is "+reverse);
	}
}
