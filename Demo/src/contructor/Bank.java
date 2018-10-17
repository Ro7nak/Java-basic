package contructor;

public class Bank {
	private String bankName;
	private String area;
	private String phoneNo;
	
	Bank(){
		bankName = "Ibank";
		area = "Gandhi Nagar";
		phoneNo = "9546287456";
		
	}
	
	Bank(String bName, String Area, String PhoneNumber){
		bankName = bName;
		area = Area;
		phoneNo = PhoneNumber;
	}
	
	public void displayDetails() {
		System.out.println("Bank Name: "+bankName);
		System.out.println("Area of bank: "+area);
		System.out.println("Phone number of bank: "+phoneNo);
	}
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		Bank bank2 = new Bank("ICICI", "Mysore", "9874326785");
		bank1.displayDetails();
		System.out.println("*********************");
		bank2.displayDetails();
	}

}
