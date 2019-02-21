package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class updateArrayTest {
     updateArray app;
    @Before
    public void setUp() throws Exception {
        app= new updateArray();
    }

    @After
    public void tearDown() throws Exception {
        app=null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        ArrayList<String> expectedValue =new ArrayList<String>();
        ArrayList<String> actualValue =new ArrayList<String>();

        //Act
        expectedValue.add("Apple");
        expectedValue.add("Grape");
        expectedValue.add("Melon");
        expectedValue.add("Berry");

        actualValue.add("Kiwi");
        actualValue.add("Grape");
        actualValue.add("Mango");
        actualValue.add("Berry");
        actualValue = app.update(expectedValue);
        //Assert
        assertArrayEquals(expectedValue.toArray(), actualValue.toArray());
    }
}