package interface_classes;

public class Execute {

	public static void main(String[] args) {
		IBank bank = new MumbaiBranch();
		Customer c1 = new Customer();
		c1.setCustomerId("CUST1001");
		c1.setName("Ajay");
		String accountNumber = bank.createAccount(c1);
		double gloan = bank.issueGoldLoan(c1);
		double hloan = bank.issueHouseLoan(c1);
		double vloan = bank.issueVehicleLoan("bike", c1);
		
		System.out.println("Customer: "+c1.getName()+" ,ID: "+c1.getCustomerId()+" ,Account number: "+accountNumber+" \nloan ammount for gold is.."+gloan+" \nloan amount for house is.."+hloan+" \nloan amount for vehicle is.."+vloan);
		System.out.println("Caution money is..."+IBank.CAUTIONMONEY);

	}

}
