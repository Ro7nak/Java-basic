package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_demo {

	public static void main(String[] args) {
		Set<String> s = new TreeSet<>();
		
		s.add("Java");
		s.add("Hibernate");
		s.add("AngularJS");
		
		System.out.println(s);
		
		for(String a: s) {
			System.out.println(a);
		}

	}

}
