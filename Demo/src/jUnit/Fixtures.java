package jUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Fixtures {
	   
    @BeforeClass
    public static void beforeClass(){
        System.out.println("A");
    }   

    @Before
    public void before(){
        System.out.println("B");
    }   

    @Test
    public void test1(){
        System.out.println("T1");
    }   

    @Test
    public void test2(){
        System.out.println("T2");
    }   

    @After
    public void after(){
        System.out.println("C");
    }   

    @AfterClass
    public static void afterClass(){
        System.out.println("D");
    }  
}
