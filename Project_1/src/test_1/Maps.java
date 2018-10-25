package test_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {

	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		HashMap m = new HashMap<>();
		m.put(1, "first");
		m.put(2, "second");
		m.put(3, "third");
		m.put(4, "five");
		System.out.println(m.put(5, "fourth"));	
		
		//m.entrySet() = 
		//java.util.Set s=  m.entrySet();
		Set i = m.entrySet();
	    Iterator it=	i.iterator() ;
		
		
		m.put(8, "eight");
		it=i.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(m);
		
	}
}
