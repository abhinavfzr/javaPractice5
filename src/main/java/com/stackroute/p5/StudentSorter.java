package com.stackroute.p5;

import java.util.Comparator;
//4. Create a Student class that represents the following information of a student: id, name, and age
//all the member variables should be private
public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.id - b.id;
    }
}
