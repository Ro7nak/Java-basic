package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
public static void main(String[] args) {
	//1st way
	String[] list = {"rou","jack","jim","harry","ben"};
	Stream<String> s = Arrays.stream(list);
	
	//2nd way
	Stream<String> stream1 = Stream.of("Jose Jacob", "Robert King", "John Mathew");
	
	//3rd way
	String fileName = "CandidateNames.txt";
				// Reading file into stream inside try-with-resources
	try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
	    stream.forEach(System.out::println);
	} catch (IOException e) {
	    e.printStackTrace();
	}
}
	
}
