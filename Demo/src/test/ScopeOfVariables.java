package test;

public class ScopeOfVariables {

	int i = 34;
	static int z;
	static {
		z = 10;
		System.out.println("inside static block:"+ z);
	}
	
	void test() {
		int k =200;
		System.out.println("local vriable:"+(k+i));
	}
	
	public static void main(String[] args) {
		ScopeOfVariables o = new ScopeOfVariables();
		o.test();
		System.out.println(o.i);
	}
}
