package com.labs;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2)); // true
        System.out.println(key1 == key2); // false

        map.put(key1, "Hadi");
        map.put(key2, "Hadi");

        System.out.println(map.size()); // 2 -> karena key1 dan key2 di anggap berbeda

        System.out.println("--------------------------------");
        Map<String, String> hashMap = new HashMap<String, String>();

        String kunci1 = "jumlah.buku";

        String jumlah = "jumlah";
        String titik = ".";
        String buku = "buku";
        String kunci2 = jumlah + titik + buku;

        System.out.println(kunci1.equals(kunci2)); // true
        System.out.println(kunci1 == kunci2); // false

        hashMap.put(key1, "Prasetyo");
        hashMap.put(key2, "Prasetyo");

        // hasil nya adalah 1 -> karena di anggap satu key
        System.out.println(hashMap.size());

    }
}
