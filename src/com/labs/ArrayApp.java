package com.labs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ArrayApp {
    public static void main(String[] args) {

        List<String> names = List.of("Hadi","John","Doe","Dika");

        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});
        String[] strings2 = names.toArray(new String[0]);

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(strings2));
    }
}
