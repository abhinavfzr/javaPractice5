package com.stackroute.p5;

import java.util.ArrayList;
//1. Write a Java program to update specific array element by given element and empty the array list.
public class updateArray {
    ArrayList<String> update(ArrayList<String> list) {
        int i = 0;
        for (String s : list) {
            if (s.equals("Apple")) {
                list.set(i, "Kiwi");
            } else if (s.equals("Melon")) {
                list.set(i, "Mango");
            }
            i++;
        }
        return list;
    }

}
