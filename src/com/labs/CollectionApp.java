package com.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
         // Bersifat dinamic => dalam artian bisa menambah sebanyak-banyaknya sekuat memori yang di punya
        Collection<String> collection = new ArrayList<String>();
        collection.add("Hadi");
        collection.add("Prasetyo");
        collection.addAll(List.of("Belajar", "Collection", "pada", "java"));

        for(var value : collection) {
            System.out.println(value);
        }

        System.out.println("remove ----------------");
        collection.remove("Hadi");
        collection.remove("Andi"); // return false -> karena tidak ada dalam collection
        collection.removeAll(List.of("Belajar", "Collection"));

        for(var value : collection) {
            System.out.println(value);
        }

        System.out.println("Mengecek data pada collection ---------------");
        System.out.println(collection.contains("Prasetyo"));
        System.out.println(
                collection.containsAll(List.of("pada", "java"))
        );

        System.out.println(collection.size());
    }
}
