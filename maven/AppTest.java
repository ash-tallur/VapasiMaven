package org.vapasibo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @BeforeTest
    public void testRunOnlyOnceBeforeATest(){
        System.out.println("Before the first test");
    }
    @BeforeMethod
    public void testSetupBeforeEveryTest(){
        System.out.println("I run before every test");
    }

    @Test
    public void runTest1(){
        System.out.println("Lets run the first test");
    }

    public void runNotTest(){
        System.out.println("Running without Test annotation");
    }

    @Test
    public void runTest2(){
        System.out.println("Let's run the second test");
    }

    @AfterMethod
    public void testAfterEveryMethod(){
        System.out.println("I run after every test");
    }

}
