package contructor;

public class Bank2 {

	private String bankName;
	
	Bank2(String bankName){
		this.bankName = bankName;
	}
	
	public static void main(String[] args) {
		Bank2 b = new Bank2("AXIS");
		System.out.println(b.bankName);

	}

}
