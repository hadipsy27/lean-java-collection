package com.labs;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Hadi", "Prasetyo","Dika","Angga","Jono","Dita"));

        // The data sort by ascending
        for (String name : names){
            System.out.println(name);
        }
        System.out.println("--------------------------------");

        NavigableSet<String> namesReverse = names.descendingSet();
        for(var name : namesReverse){
            System.out.println(name);
        }

        NavigableSet<String> prasetyo = names.tailSet("Prasetyo", true);
        System.out.println("--------------------------------");
        for(var name : prasetyo){
            System.out.println(name);
        }

        System.out.println("--------------------------------");

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("upsss"); // error karena bersifat immutable tidak bisa di tambahkan data

    }
}
