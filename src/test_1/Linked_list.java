package test_1;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();
		LinkedList<String> l2 = new LinkedList<>();
		l1.add("rounak");
		l1.add("jack");
		System.out.println(l1.size());
		Iterator<String> i = l1.iterator();
		for (Iterator iterator = l1.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		l1.add("john");
		i = l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			
		while(l1.element()!= null) {
			System.out.println(l1.pop());
		}
		
		
	}

}
