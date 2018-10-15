package loops;

public class Switch_case {

	public static void main(String[] args) {
		int choice = 0;
		choice =2;
		switch (choice) { // if break is not given then all cases will be executed.
		case 1:
			System.out.println("entry operation");
			break;
		case 2:
			System.out.println("display operation");
			break;
		case 3:
			System.out.println("deposit operation");
			break;
			
		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}
