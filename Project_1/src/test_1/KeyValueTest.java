package test_1;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class KeyValueTest {

	public static void main(String[] args) {
		
		HashMap<String,String> hm= new HashMap<>();
		
		hm.put("1", "qw");
		hm.put("2", "we");
		hm.put("3", "er");
		hm.put("4", "rt");
		hm.put("5", "ty");
		hm.put("6", "yu");
		hm.put("7", "ui");
		hm.put("8", "io");
		
		
		java.util.Set<String> s= hm.keySet();
		Iterator<String> i = s.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		
		Iterator<Entry<String, String>> i2=hm.entrySet().iterator();
		
		while(i2.hasNext()) {
			Entry<String, String> next = i2.next();
			System.out.print(next.getKey());//next.getKey();
			System.out.print(next.getValue());//next.getValue();
			System.out.println();
			
		}
	}
}
