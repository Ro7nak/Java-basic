package loops;

public class IfElseLoops {

	public static void main(String[] args) {
		double balance = 600;
		System.out.println("amount to withdraw");
		double amount = 500;
		
		if(amount<=0) {
			System.out.println("withdrawal has failed as the amount is smaller then zero");
		}
		else if(amount>balance) {
			System.out.println("withdrawal has failed as amount is greater then balance");
		}
		else {
			balance -= amount;
			System.out.println("withdrwal has succeeded");
		}
	}

}
