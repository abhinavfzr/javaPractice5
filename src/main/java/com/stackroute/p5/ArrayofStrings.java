package com.stackroute.p5;

import java.util.*;
//3. Write a program where an array of strings is input and output is a Map<String,boolean> where
//each different string is a key and its value is true if that string appears 2 or more times in the array
public class ArrayofStrings {
    Map<String, Boolean> arrayCheck(String[] array) {
        List asList = Arrays.asList(array);
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        Set<String> mySet = new HashSet<String>(asList);
        for (String s : mySet) {
            if (Collections.frequency(asList, s) > 1) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }

        }

        return map;
    }
}
