package jUnit;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

class MTest {
	public void display() throws IOException {
		throw new IOException();
	}
}

public class ExceptionDemo {

	@Test(expected = FileNotFoundException.class)
	public void testOneDisplay() throws IOException {
		MTest m = new MTest();
		m.display();
	}
	@Test(expected = IOException.class)
	public void testTwoDisplay() throws IOException {
		MTest m = new MTest();
		m.display();
	}
}