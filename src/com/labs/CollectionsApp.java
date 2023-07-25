package com.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        System.out.println("The List");
        list.addAll(List.of("Hadi", "Prasetyo", "Andi", "Pratama","Dika", "Pangestu"));

        System.out.println(list);

        System.out.println("Reverse List");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("Random Position List");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
