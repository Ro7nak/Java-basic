package test;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  = 60;
		int x = 50;
		int result = (x>a)?a:x;
		System.out.println(result);
		String name = "John";
		String pass= "Infy123";
		String s = (name.equals("John")&&pass.equals("Infy123"))?"Welcome!":"Wrong password or user name";
		System.out.println(s);
	}

}
