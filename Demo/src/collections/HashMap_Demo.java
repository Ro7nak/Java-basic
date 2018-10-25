package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap_Demo {

	public static void main(String[] args) {
		Set<Course> s1 = new HashSet<>();
		s1.add(new Course("Java"));
		s1.add(new Course("PHP"));
		
		Set<Course> s2 = new HashSet<>();
		s2.add(new Course("HTML"));
		s2.add(new Course("CSS"));
		s2.add(new Course("DBMS"));
		
		Map<Integer, Set<Course>> m = new HashMap<>();
		m.put(1001, s1);
		m.put(1002, s2);
		
		
		System.out.println(m.values());
		Set<Course> cs = m.get(1001);
		System.out.println(cs);
		
		Set<Integer> setOfKeys = m.keySet();
		for(Integer i: setOfKeys)
			System.out.println(m.get(i));
		
		for(Set<Course> s: m.values())
			System.out.println(s);
	}

}
