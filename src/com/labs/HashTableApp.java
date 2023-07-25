package com.labs;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        // sama seperti vector semua method nya bersifat sinkronize
        Map<String, String> map = new Hashtable<>();
        map.put("nameFirst", "Hadi");
        map.put("nameLast", "Prasetyo");

        for(var key : map.keySet()){
            System.out.println(key);
        }


    }
}
