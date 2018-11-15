package jUnit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalc  {
        @Test
         public void testingMethod() {
                 String str = "Info";
                 assertEquals("Infosys",str.concat("sys"));
         }
}
