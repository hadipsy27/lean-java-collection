package com.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("one");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<String>();
        mutable.add("Hadi");
        mutable.add("Prasetyo");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Hadi", "Prasetyo");
//        elements.add("Hadi"); // error ketika menambahkan data ke dalam immutable list

    }
}


