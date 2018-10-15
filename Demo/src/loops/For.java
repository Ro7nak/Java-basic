package loops;

public class For {

	public static void main(String[] args) {
		double balance = 6000, rateofInterest = .10,interest =0;
		double withdrawal = 500,deposit=600;
		
		for (int i =0; i<12;i++) {
			balance += deposit;
			balance -= withdrawal;
			interest = balance*rateofInterest;
			balance += interest;
			System.out.println("Balance after month "+i+" is "+ balance);
			System.out.println("the interest for the month "+i+" is :"+interest);
		}
		System.out.println("the balance at the end of the year is :"+ balance);

	}

}
