package com.java.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void test1() {
        System.out.println("test1 running");
    }

    @Test(enabled = false)
    public void test2() {
        System.out.println("test2 running");
    }

}
