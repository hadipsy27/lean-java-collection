package com.labs;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SplitIteratorApp {
    public static void main(String[] args) {

        List<String> list = List.of("Hadi", "Prasetyo", "Andi", "Khoirudin","Koco", "Cipto");

        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit(); // di coba untuk di split (dipotong)
        Spliterator<String> spliterator3 = spliterator2.trySplit(); // di coba untuk di split (dipotong)


        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());
        System.out.println(spliterator3.estimateSize());

        System.out.println("----------------");
        System.out.println();

        List<String> list1 = List.of("Hadi", "Prasetyo", "Andi", "Khoirudin","Koco", "Cipto");

        Spliterator<String> spliterator4 = list1.spliterator();
        Spliterator<String> spliterator5 = spliterator4.trySplit(); // di coba untuk di split (dipotong)

        spliterator4.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("----------------");

        spliterator5.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
