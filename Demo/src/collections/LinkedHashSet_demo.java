package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_demo {

	public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<>();
		s.add("add");
		s.add("divide");
		s.add("add");
		
		System.out.println(s);
		
		Iterator<String> i = s.iterator();
		while(i.hasNext())
			System.out.println(i.next());

	}

}
