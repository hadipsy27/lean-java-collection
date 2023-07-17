package com.labs;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("name.first", "Hadi");
        map.put("name.last", "Prasetyo");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.last"));

    }
}
