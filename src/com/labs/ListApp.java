package com.labs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Hadi");
        strings.add("Prasetyo");
        strings.add("Kurniawan");
        strings.add("Iwan");

        strings.set(0, "Budi");
        strings.remove(1);

        System.out.println(strings.get(1));
        System.out.println("--------------------------------");

        for(var value : strings) {
            System.out.println(value);
        }

        System.out.println("--------------------------------");
        List<String> list = new LinkedList<>(); // Penggunannya sama dengan array list karena turunan dari collection
        list.add("John");
        list.add("Doe");

        for (var value : list) {
            System.out.println(value);
        }

    }
}
