package test_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Test {

	
	public static void main(String[] args) {
		
		List listTest=new ArrayList();
		listTest.add("rounak");
		listTest.add("manu");
		listTest.add("shaky");
		listTest.add("arpit");
		listTest.add("garud");
		System.out.println(listTest);
		
		List listTest2 = new LinkedList<>();
		listTest2.add("rounak");
		listTest2.add("manu");
		listTest2.add("shaky");
		listTest2.add("arpit");
		listTest2.add("garud");
		System.out.println(listTest2);
		
		ArrayList ar = new ArrayList<>();
		ar.add("growup");
		ar.add("");
		ar.add("you");
		ar.add("stupit sob");
		System.out.println(ar);
		
		
	}
}
