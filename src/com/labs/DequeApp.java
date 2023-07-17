package com.labs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeApp {
    public static void main(String[] args) {

        // Tidak hanya FIFO (First In First Out) Deque juga mendukuk LIFO (Last In Last Out)
        Deque<String> deque = new LinkedList<>();

        deque.offerFirst("Hadi");
        deque.offerFirst("Prasetyo");
        deque.offerFirst("Andi");

        for (var value : deque){
            System.out.println(value);
        }

        System.out.println("--------------------------------");

        Deque<String> stack = new LinkedList<>();
        stack.offerLast("satu");
        stack.offerLast("dua");
        stack.offerLast("tiga");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("--------------------------------");

        Deque<String> queue = new LinkedList<>();
        // Jika ada antrian masukknya paling belakang dulu
        queue.offerLast("empat");
        queue.offerLast("lima");
        queue.offerLast("enam");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
