package wrapperClass;

public class WrapperClassTester {

	public static void main(String[] args) {
		int i = 45;
		Integer integer = new Integer(i);
		int i2 = integer.intValue();
		
		Integer integer2 = new Integer("23");
		System.out.println(integer2);
		
		Integer intObj1 = new Integer(25);
		Integer intObj2 = new Integer("25");
		Integer intObj3 = new Integer(35);
		
		System.out.println("Comparing using compareTo Obj1 and Obj2: "+intObj1.compareTo(intObj2) );
		System.out.println("Compare using compareTo Obj1 and Obj3: "+intObj1.compareTo(intObj3));
		
		System.out.println("Compare using compareTo Obj1 and Obj2: "+intObj1.equals(intObj2));
		System.out.println("Compare using compareTo Obj1 and Obj3: "+intObj1.equals(intObj3));
		
		Float f1 = new Float("2.25f");
		Float f2 = new Float("20.43f");		
		Float f3 = new Float(2.25f);

		System.out.println("Compare using compare f1 and f2: "+Float.compare(f1, f2));
		System.out.println("Compare using compare f1 and f3: "+Float.compare(f1, f3));
		
		Float f = intObj1.floatValue()+f1;
		System.out.println("Addition of intObj1 and f1: "+intObj1+" + "+f1+" = "+f);
		
		int x = Integer.parseInt("34");
		System.out.println(x);
		double y = Double.parseDouble("34.7");
		System.out.println(y);
	}

}
