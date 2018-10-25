package test_1;

public class Numbers {

	public static  int sum=0;
	public  int a=10;
	public int b=5;
	public static double multi;
	
	public static int add(int a,int b) {
		sum=a+b;
		return sum;
	}
	
	public static double multi(int a,int b) {
		multi=a*b;
		return multi;
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(3,4));
		System.out.println(multi(5,6));
	}
}
