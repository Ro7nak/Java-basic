package test_1;

import java.util.Iterator;

public class ArrayList {

	
	public static void main(String[] args) {
		
		//ArrayList<String> al = new ArrayList<String>();
		java.util.ArrayList<String> al = new java.util.ArrayList<String>();
		
		al.add("Rounak");
		al.add("Vijay");
		al.add("Pravin");
		al.add("Bhawana");
		al.add("Karthik");
		al.add("Pradeep");
	java.util.ArrayList<String> a2 = new java.util.ArrayList<String>();
	a2.add("Rounak");
	a2.add("Vijay");
	a2.add("Pravin");
	a2.add("Bhawana");
	a2.add("Karthik");
	a2.add("Pradeep");
	
	
	al.addAll(a2);
	//	for (String Next: al) {
		//	System.out.println(Next);
	//	}
		
		//System.out.println();
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println();
		al.removeAll(a2);
		
		Iterator<String> i1 = al.iterator();
		while(i1.hasNext()) {
			System.out.println(i.next());
		}
				
	}
}
