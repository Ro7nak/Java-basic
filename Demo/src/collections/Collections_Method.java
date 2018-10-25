package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Method {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Infosys");
		al.add("TCS");
		al.add("IBM");
		al.add("Wipro");
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);

	}

}
