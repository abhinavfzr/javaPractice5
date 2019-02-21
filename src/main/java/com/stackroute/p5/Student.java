package com.stackroute.p5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//4. Create a Student class that represents the following information of a student: id, name, and age
//all the member variables should be private
public class Student {
    int id;
    String name;
    int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Student() {

    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    ArrayList<Student> sort(ArrayList<Student> arr) {
        Comparator c = Collections.reverseOrder(new StudentSorter());
        Collections.sort(arr, c);
        return arr;
    }
}
