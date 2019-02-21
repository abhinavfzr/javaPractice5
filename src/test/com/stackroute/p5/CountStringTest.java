package com.stackroute.p5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountStringTest {
    CountString app;
    @Before
    public void setUp() throws Exception {
        app=  new CountString();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }

    @Test
    public void test() {
        Map<String,Integer> expectedValue =new HashMap<String, Integer>();
        Map<String,Integer> actualValue =new HashMap<String, Integer>();

        //Act
        expectedValue.put("one",5);
        expectedValue.put("two",2);
        expectedValue.put("three",2);

        actualValue = app.countStr("one one one two three one three one two");
        //Assert
        Assert.assertEquals(expectedValue, actualValue);    }
}