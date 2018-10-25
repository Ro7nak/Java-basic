package collections;

import java.util.*;

public class List_Demo {

	public static void main(String[] args) {
		List<Course> l = new LinkedList<>();
		
		l.add(new Course("Java"));
		l.add(new Course("Hibernate"));
		l.add(new Course("AngularJS"));
		
		for(Course c: l)
			System.out.println(c.getName());
		
		Iterator<Course> i = l.iterator();
		while(i.hasNext()) {
			Course c = i.next();
			System.out.println(c.getName());
		}
	
		List<String> nameList = new ArrayList<>();
		nameList.add(0,"One");
		nameList.add(1,"Two");
		for(String no:nameList){
			System.out.println(no);
		}
	
	}
}