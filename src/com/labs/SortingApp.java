package com.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String>  list = new ArrayList<>();

        list.addAll(List.of("Hadi", "Prasetyo", "Diki", "Andi"));

        System.out.println("Sebelum di urutkan ---------");
        for (var val : list) {
            System.out.println(val);
        }

        Collections.sort(list);


        System.out.println();
        System.out.println("Setelah di urutkan ---------");
        for (var value : list) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Contoh apabila Menggunakan Comparator");

        // Reverse String (Urutkan secara descending)
        Comparator<String> reverse = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        // Gunakan Comparatornya
        Collections.sort(list, reverse);
        for(var v : list) {
            System.out.println(v);
        }

    }
}
