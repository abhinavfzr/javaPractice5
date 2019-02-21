package com.stackroute.p5;

import java.util.Map;
//5. Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
//Modify and return the given map as follows:
public class ModifyKey {
    Map<String, String> modifykey(Map<String, String> map) {
        map.replace("val2", map.get("val1"));
        map.replace("val1", " ");
        return map;

    }
}
