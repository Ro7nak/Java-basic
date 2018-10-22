package exception;

public class Throw {

	public static void divide(int x,int y) throws Exception{
		if(y==0)
			throw new Exception("The divisor should not be zero");
		int z = x/y;
		System.out.println(z);
		
	}
	public static void main(String[] args) {
		try {
			divide(10,0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
