package jUnit;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

class MyTest {
	public void display() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
}

public class ExceptionTest {

	@Test(expected = IOException.class)
	public void testDisplay() throws FileNotFoundException {
		MyTest m = new MyTest();
		m.display();
	}

}