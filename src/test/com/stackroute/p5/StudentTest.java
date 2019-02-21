package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    Student ar1;
    Student ar2;
    Student ar3;
    Student ar4;
    Student ar5;
    ArrayList<Student> ar = new ArrayList<Student>();

    @Before
    public void setUp() throws Exception {
        ar1=new Student(5, "gopal", 12);
        ar2=new Student(4, "rishab", 18);
        ar3=new Student(3, "anand", 16);
        ar4=new Student(2, "suraj", 18);
        ar5=new Student(1, "abhinav", 16);
        ar.add(ar5);
        ar.add(ar4);
        ar.add(ar3);
        ar.add(ar2);
        ar.add(ar1);
    }

    @After
    public void tearDown() throws Exception {
        ar1=null;
        ar2=null;
        ar3=null;
        ar4=null;
        ar5=null;
    }

    @Test
    public void test() throws Exception {
        //Arrange
        Student app= new Student();
        ArrayList<Student> expectedValue =new ArrayList<Student>();
        ArrayList<Student> actualValue =new ArrayList<Student>();

        //Act
       Student er1=new Student(5, "gopal", 12);
       Student er2=new Student(4, "rishab", 18);
       Student er3=new Student(3, "anand", 16);
       Student er4=new Student(2, "suraj", 18);
       Student er5=new Student(1, "abhinav", 16);
        expectedValue.add(er1);
        expectedValue.add(er2);
        expectedValue.add(er3);
        expectedValue.add(er4);
        expectedValue.add(er5);
        actualValue = app.sort(ar);
        //Assert
        assertEquals(expectedValue.toString(),actualValue.toString());
    }
}