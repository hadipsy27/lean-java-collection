package com.labs;

import com.labs.data.Person;
import com.labs.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator()); // ascending
//        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed()); // descending.

        people.add(new Person("Hadi"));
        people.add(new Person("Budi"));
        people.add(new Person("Dika"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        sortedSet.add(new Person("Kurniawan")); // error karena bersifat immutable set

    }
}
