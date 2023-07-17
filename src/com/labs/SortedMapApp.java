package com.labs;

import java.util.*;

public class SortedMapApp {
    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Descending
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Budi", "Budi");
        sortedMap.put("Eko", "Eko");
        sortedMap.put("Joko", "Joko");
        sortedMap.put("Andi", "Andi");

        System.out.println(sortedMap);

        System.out.println("--------------------------------");
        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
        // immutable.put("Nugraha", "Nugraha"); // Error tidak bisa di rubah lagi

    }
}
