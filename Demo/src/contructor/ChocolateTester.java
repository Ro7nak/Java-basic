package contructor;

public class ChocolateTester {

	public static void main(String[] args) {
		Chocolate c = new Chocolate();
		System.out.println(c.getBarCode());
		c.setBarCode(102);
		System.out.println(c.getBarCode());
	}

}
