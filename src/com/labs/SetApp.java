package com.labs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        // Set tidak menerima data duplikat
        // HasSet tidak mengurutkan data berdasarkan inputan data
        Set<String> names = new HashSet<String>();
        names.add("Hadi");
        names.add("Prasetyo");
        names.add("Andi");

        names.add("Hadi");
        names.add("Prasetyo");
        names.add("Andi");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("----------------------------------------------------------------");

        // Set tidak menerima data duplikat
        // Kalau LinkedHashSet sifatnya mengurutkan data berdasaran urutan data yg di masukkan
        Set<String> hobbies = new LinkedHashSet<>();
        hobbies.add("Coding");
        hobbies.add("Mancing");
        hobbies.add("Makan");

        hobbies.add("Coding");
        hobbies.add("Mancing");
        hobbies.add("Makan");

        for (var hobby : hobbies){
            System.out.println(hobby);
        }
    }
}
