package org.vapasi;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {

    @Test
    public void testEqualAssertions(){
           String a ="Logged in successfully";
           String b = "Logged in succssfully";

        Assert.assertEquals(a,b,"On Login Page welcome message doesn't match");
    }

    @Test
    public void testAssertTrue(){
        int actual =1;
        int expected =12;

        Assert.assertTrue(sum(actual,expected),"Sum didn't match");
    }

    public static boolean sum(int a,int b){
        System.out.println(a==b);
        return (a==b);
    }
}
