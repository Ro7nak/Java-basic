package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Collections_Sort_UserDefineObject {

	public static void main(String[] args) {
		ArrayList<Course2> courseList = new ArrayList<>();
		courseList.add(new Course2(124, "AngularJS"));
		courseList.add(new Course2(120, "Java"));
		courseList.add(new Course2(121, "Hibernate"));

		Collections.sort(courseList);
		System.out.println(courseList);

		Set<Course2> courseSet = new TreeSet<>();
		courseSet.add(new Course2(124, "AngularJS"));
		courseSet.add(new Course2(120, "Java"));
		courseSet.add(new Course2(121, "Hibernate"));
		System.out.println(courseSet);
	}

}
