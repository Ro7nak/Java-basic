package exception;

public class Demo {

	public static void divide(int x, int y) {
		
		try {
			if(y==0)
				throw new Exception("The divisor should not be zero");
			int z = x/y;
			System.out.println(z);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		try {
		divide(10,0);
		}
		catch(ArithmeticException e) {
			System.out.println("the divisor should not be zero"+ e.getMessage());
		}
		catch(Exception e) {
			
		}
		
	}

}
