package test;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int billId = 1001;
		int customerId= 101;
		float billAmount = 199.99f;
		
		double discount = billAmount - (billAmount*(2/100));
		System.out.println(discount);
	}

}
