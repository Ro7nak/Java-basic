package static_keyword;

public class Account {
	
	static int minbalance;
	
	static {
		minbalance = 500;
	}

	public static int getMinimumBalance() {
		return minbalance;
	}
	public static void main(String[] args) {
		System.out.println("The value.."+ getMinimumBalance());

	}

}
