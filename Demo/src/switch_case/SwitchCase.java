package switch_case;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please select your choice:");
		System.out.println("1.Calculate Armstrong");
		System.out.println("2.Calculate Lucky Number");
		int choice = scan.nextInt();
		System.out.println("your choice is "+choice);
		switch (choice) {
		case 1:
			break;
		case 2:
			break;
		default:
			System.out.println("Oops! Invalid choice!");
			break;
		}

	}

}
