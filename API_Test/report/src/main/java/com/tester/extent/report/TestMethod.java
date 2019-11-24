package com.tester.extent.report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("1","2");
    }
    @Test
    public void logDemo(){
        Reporter.log("this is a report");
        throw new RuntimeException("runtime error");
    }
}
