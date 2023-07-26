package com.labs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        // Default method pada List
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        });

        System.out.println(numbers);

        System.out.println("--------------------------------");

        for(var value : numbers){
            System.out.println(value);
        }

        // jika menggunakan default method akan menjadi seperti ini

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 500;
            }
        });

        System.out.println(numbers);


    }
}
