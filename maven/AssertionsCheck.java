package org.vapasibo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class AssertionsCheck {

    @Test
    public void testAssertions(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int actual = sc.nextInt();
//        System.out.println("Enter second number");
//        int expected = sc.nextInt();
        int a = 4;
        int b =6;
        int result = a+b;
        int expected = 10;
        //Assert.assertEquals(sum(actual,expected),"Sum does not match");
        Assert.assertEquals(result,expected,"Sum does not match");
    }

    @Test
    public void testAssertTrue(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int actual = sc.nextInt();
//        System.out.println("Enter second number");
//        int expected = sc.nextInt();
        int actual = 4;
        int expected = 8;

        Assert.assertTrue(sum(actual,expected),"Sum of two numbers did not match");
    }

    @Test
    public void testAssertFalse(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers");
//        int actual = sc.nextInt();
//        System.out.println("Enter second number");
//        int expected = sc.nextInt();
       int actual = 3;
       int expected = 4;

        Assert.assertFalse(sumNotEqual(actual,expected),"Sum of two numbers match");

    }

    public static boolean sum(int a,int b){

        int result = a+ b;
        System.out.println(result);
        return (result == (a+b));

    }

    public static boolean sumNotEqual(int a,int b){

        int result = a+ b;

        return (result != (a+b));

    }

}
