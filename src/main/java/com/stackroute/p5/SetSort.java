package com.stackroute.p5;

import java.util.ArrayList;
import java.util.TreeSet;
//6. Write a program to implement set interface which sorts the given randomly ordered names in
//ascending order. Convert the sorted set in to an array list
public class SetSort {
    ArrayList<String> setArraySort(ArrayList<String> list) {
        TreeSet<String> set = new TreeSet<String>(list);
        return new ArrayList<String>(set);
    }
}
