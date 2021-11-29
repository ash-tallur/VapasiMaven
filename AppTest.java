package org.vapasi;

import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @BeforeClass
    public void testRunBeforeClass(){
        System.out.println("I run before the class");
    }
    @BeforeTest
    public void testRunOnlyOnceBeforeATest(){
        System.out.println("Before the first test");
    }
    @BeforeMethod
    public void testSetupBeforeEveryTest(){
        System.out.println("I run before every test");
    }

    @Test
    public void method(){
        System.out.println("Hello I am the method");
    }

    @AfterMethod
    public void testAfterEveryMethod(){
        System.out.println("I run after every test");
    }

    @Test
    public void method2(){
        System.out.println("Hello I am Method/Test case 2");
    }


}
