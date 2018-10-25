package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Demo {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("one");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		
		for(int i = 0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		al.remove(0);
		al.remove(al.size()-1);
		System.out.println("***********");
		for(String s: al) {
			System.out.println(s);
		}
		System.out.println("************");
		al.add(0, "six");
		al.add(al.size(), "Seven");
		Iterator<String> i = al.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}

}
