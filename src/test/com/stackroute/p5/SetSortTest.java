package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SetSortTest {
    SetSort app;
    @Before
    public void setUp() throws Exception {
        app= new SetSort();
    }

    @After
    public void tearDown() throws Exception {
        app= null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        ArrayList<String> list =new ArrayList<String>();
        ArrayList<String> expectedValue =new ArrayList<String>();
        ArrayList<String> actualValue =new ArrayList<String>();

        //Act
        list.add("Harry");
        list.add("Olive");
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");
        expectedValue.add("Alice");
        expectedValue.add("Bluto");
        expectedValue.add("Eugene");
        expectedValue.add("Harry");
        expectedValue.add("Olive");
        actualValue = app.setArraySort(list);
        //Assert
        assertArrayEquals(expectedValue.toArray(), actualValue.toArray());
    }
}