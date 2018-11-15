package jUnit;

import org.junit.Before;
import org.junit.Test;

//Assume all the required imports are added

class MyTimeoutTest {
	public void display() throws InterruptedException {
		Thread.sleep(200);
	}
}

public class TimeoutDemo {
	@Before
	public void setup() throws InterruptedException {
		Thread.sleep(2000);
	}

	@Test(timeout = 100)
	public void test() throws InterruptedException {
		MyTimeoutTest m = new MyTimeoutTest();
		m.display();
	}

	@Test(timeout = 200)
	public void test1() throws InterruptedException {
		MyTimeoutTest m = new MyTimeoutTest();
		m.display();
	}

	@Test(timeout = 300)
	public void test2() throws InterruptedException {
		MyTimeoutTest m = new MyTimeoutTest();
		m.display();
	}

	@Test(timeout = 150)
	public void test4() throws InterruptedException {
		MyTimeoutTest m = new MyTimeoutTest();
		m.display();
	}
}
