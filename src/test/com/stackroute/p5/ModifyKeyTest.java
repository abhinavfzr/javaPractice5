package com.stackroute.p5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyKeyTest {
      ModifyKey app;
    @Before
    public void setUp() throws Exception {
        app= new ModifyKey();
    }

    @After
    public void tearDown() throws Exception {
        app=null;
    }

    @Test
    public void test() {
        Map<String,String> map =new HashMap<String, String>();
        Map<String,String> expectedValue =new HashMap<String, String>();
        Map<String,String> actualValue =new HashMap<String, String>();

        //Act
        map.put("val1","java");
        map.put("val2","c++");
        expectedValue.put("val1"," ");
        expectedValue.put("val2","java");

        actualValue = app.modifykey(map);
        //Assert
        Assert.assertEquals(expectedValue, actualValue);
    }
}