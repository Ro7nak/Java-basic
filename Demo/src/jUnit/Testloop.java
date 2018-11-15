package jUnit;

import org.junit.Test;

import junit.framework.Assert;

public class Testloop {
    Loopdemo tc = new Loopdemo();
    char value;
@Test
public void testdispaly(){
  value = tc.display(64);
  Assert.assertSame(value, 'F');
  value = tc.display(93);
  Assert.assertSame(value, 'A');
  value = tc.display(70);
  Assert.assertSame(value, 'B');
}
}
