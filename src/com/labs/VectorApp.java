package com.labs;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();

        list.add("Hadi");
        list.add("Prasetyo");
        list.add("chosaku");

        for (var value : list) {
                System.out.println("tesing");
            System.out.println(value);
        }
    }
}
