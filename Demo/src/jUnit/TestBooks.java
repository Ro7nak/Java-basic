package jUnit;
import org.junit.Test;
import org.junit.Assert;

public class TestBooks {
		
	 @Test
	   public void stringAssertEqual() {
		 Books bookObjFirst = new Books(1, "abc");
		 Books bookObjSecond = new Books(1, "abc");
		 Assert.assertEquals(bookObjFirst,bookObjSecond);
	   }
	 @Test
	 public void stringAssertSame() {
		 Books bookObjFirst = new Books(2, "pqr");
		 Books bookObjSecond = new Books(2, "pqr");
		 Assert.assertSame(bookObjFirst, bookObjSecond);      
	 } 
	
}
