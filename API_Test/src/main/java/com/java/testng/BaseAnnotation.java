package com.java.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseAnnotation {
    @Test
    public void testCase1() {
        System.out.println("test test test");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod test");
    }


}

