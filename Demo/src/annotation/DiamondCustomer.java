package annotation;

public class DiamondCustomer extends Customer{

	@Override
	@MethodInfo(author="Rounak")
	@MethodInfo(author="Akhi")
	public void calculateAmount(int amount) {
		System.out.println("total amount for diamond customer");
		
	}
}
