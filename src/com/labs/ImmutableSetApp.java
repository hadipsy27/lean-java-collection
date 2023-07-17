package com.labs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Hadi");

        Set<String> mutable = new HashSet<>(empty);
        mutable.add("Hadi");
        mutable.add("Prasetyo");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        for (var value : immutable) {
            System.out.println(value);
        }

        Set<String> set = Set.of("Hadi", "Prasetyo"); // tidak boleh duplikat
//        set.remove("Hadi"); // tidak bisa di hapus karena bersifat immutable
//        set.add("Prasetyo"); // tidak bisa menambahkan data karena bersifat immutable

    }
}
