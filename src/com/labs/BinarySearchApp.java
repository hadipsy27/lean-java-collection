package com.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {

        // Buat data array dari 1 - 1000
        // syarat dari binary search data harus sudah terurut
        // berhubung data yg di bawah ini adalah perulangan dari 1 - 1000
        // maka data sudah berurut
        List<Integer> list = new ArrayList<Integer>(1000);
        for (int i = 1; i <= 1000; i++){
            list.add(i);
        }

        int index = Collections.binarySearch(list, 333);
        // Result dari binary search adalah index nya
        System.out.println(index);

        // Dengan bantuan comparator
        // Misal : ingin mencari data dari belakang
        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        int index2 = Collections.binarySearch(list, 333, comparator);
        System.out.println(index2);

    }
}
