package com.labs;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();
        map.put("Hadi", "HadiValue");
        map.put("Andi", "AndiValue");
        map.put("Dika", "DikaValue");
        map.put("Roni", "RoniValue");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("--------------------------------");
        System.out.println(map.lowerKey("Hadi"));
        System.out.println(map.higherKey("Hadi"));
        System.out.println(map.higherKey("Nugraha"));
        System.out.println(map.higherKey("Nugraha"));

        System.out.println("--------------------------------");
        NavigableMap<String, String> mapDescending = map.descendingMap();
        for (var key : mapDescending.keySet()) {
            System.out.println(key);
        }

        System.out.println("Imuutable NavigableMap");
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);
        immutable.put("Hadi","Hadi"); // Error karena bersifat immutable
    }
}
