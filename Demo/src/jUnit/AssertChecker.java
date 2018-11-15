package jUnit;

import org.junit.Test;
import org.junit.Assert;

public class AssertChecker {
	String first = "abc";
	String second = "abc";
	String third = new String("abc");
	String fourth = new String("abc");

	@Test
	public void stringAssertEqual() {
		Assert.assertEquals(first, second);
	}

	@Test
	public void stringAssertEquals() {
		Assert.assertEquals(third, fourth);
	}

	@Test
	public void stringAssertSame() {
		Assert.assertSame(first, second);
	}

	@Test
	public void stringAssertSames() {
		Assert.assertSame(third, fourth);
	}
}
