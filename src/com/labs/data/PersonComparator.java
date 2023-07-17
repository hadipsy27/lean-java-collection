package com.labs.data;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        // Urutkan berdasarkan nama secara ASC
        return o1.getName().compareTo(o2.getName());
    }

}
