package com.labs;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new WeakHashMap<Integer, Integer>();
        // Buat perluangan dari 0 sampa 1 Juta
        for (int i = 0; i < 1_000_000; i++) {
            map.put(i, i);
        }

        // Jika menggunakan WeakHashMap banyak data yg hilang karena -
        // data gak pernah dipakai atau di akses maka akan dihapus -
        // apabila garbage collector nya nyala.
        // jadi data yg lama yg jarang di akses itu akan di hapus.
        // cuma data yg di hapus tidak bisa di pastikan mana data yg di hapus -
        // itu urusannya si garbage collector.
        System.gc();

        System.out.println(map.size());
    }
}
