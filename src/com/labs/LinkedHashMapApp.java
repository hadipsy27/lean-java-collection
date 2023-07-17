package com.labs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<String, String>();

        map.put("first", "hadi");
        map.put("second", "Prasetyo");
        map.put("last", "Andi");

        // mengurutkan key sesuai berdasarkan posisi memasukkan data map nya
        // pengurutan ini hanya bisa diterapkan pada LinkedHashMap
        // tetapi untuk menge Get datanya lebih lama apalagi posisnya berada di paling akhir
        Set<String> keys = map.keySet();
        for(var key :keys){
            System.out.println(key);
        }

        System.out.println("--------------------------------");
        System.out.println(map.get("last")); // Get Data by key

        System.out.println("--------------------------------");
        // Get Data by key -> menggunakan perulangan
        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}