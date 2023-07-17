package com.labs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        // Queue<String> queue = new ArrayDeque<>();

        // jika menginginkan membuat queue tapi ingin berurut secara asc bisa pakai PriorityQueue
        // Queue<String> queue = new PriorityQueue<>();

        // Jika ingin menggunakan LinkedList bisa seperti ini
        Queue<String> queue = new LinkedList<>();


        // cetak urutan dari 0 sampai < 20
//        for (int i = 0; i < 20; i++) {
//            queue.add(String.valueOf(i));
//        }

        // tambahkan data ke dalam queue
        queue.add("Hadi");
        queue.add("Dika");
        queue.add("Prasetyo");

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        // kosong karena  menggunakan method poll -> poll itu mendapatkan dan menghapus data paling depan
        System.out.println(queue.size());
    }
}
