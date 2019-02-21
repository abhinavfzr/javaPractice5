package com.stackroute.p5;

import java.util.*;

//2. Write a program to find the number of counts in the following String. Store the output in
public class CountString {
    Map<String, Integer> countStr(String str) {
        String array[] = str.split(" ");
        List asList = Arrays.asList(array);
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> mySet = new HashSet<String>(asList);
        for (String s : mySet) {

            map.put(s, Collections.frequency(asList, s));
        }
        return map;
    }
}
