package com.stackroute.p5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayofStringsTest {

    ArrayofStrings app;
    @Before
    public void setUp() throws Exception {
        app= new ArrayofStrings();
    }

    @After
    public void tearDown() throws Exception {
        app=null;
    }

    @Test
    public void test() {
             String str[]={"a","b","c","d","a","c","c"};
            Map<String,Boolean> expectedValue =new HashMap<String, Boolean>();
            Map<String,Boolean> actualValue =new HashMap<String, Boolean>();

            //Act
            expectedValue.put("a",true);
            expectedValue.put("b",false);
            expectedValue.put("c",true);
            expectedValue.put("d",false);

        actualValue = app.arrayCheck(str);
            //Assert
            Assert.assertEquals(expectedValue, actualValue);
    }
}