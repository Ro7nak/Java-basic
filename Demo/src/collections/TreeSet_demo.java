package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
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

		List<String> al = new ArrayList<String>();
		al.add("infosys");
		al.add("google");
		al.add("ibm");
		al.add("Amazon");
		for (int j = 0; j < al.size(); j++) {
			al.remove(j);
			if (al.get(j++).equals("google")) {
				al.add("Oracle");
			}
		}
		System.out.println(al);
		
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(2, "A");
		map.put(1, "B");
		map.put(3, "C"); 
		//map.put(null,"E");  //1
		map.put(4,null);    //2
		map.put(1,"D");     //3
		Collection <String> collection = map.values();
		for(String element : collection){
			System.out.println(element);
		}
		
		Set<String> s2 = new TreeSet<String>();
		//s2.add(2);
		s2.add("1");
		s2.add("3");
		Iterator i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next() + " ");
		}
		
		
		
	}

}
