package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) throws IOException {
		// Create a stream instance to write to a file
		FileOutputStream outFile = new FileOutputStream("StudentData.bin");

		Set<Course>courses=new HashSet<>();
		courses.add(new Course("Java"));
		courses.add(new Course("Python"));

		// Get a student object
		Student student=new Student(20156,"Peter","Johnson","29/05/1995",courses,23);

		// Create ObjectStream
		ObjectOutputStream objStream = new ObjectOutputStream(outFile);

		// Write the student object
		objStream.writeObject(student);

		objStream.close();
		outFile.close();

	}

}
