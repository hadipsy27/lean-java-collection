package com.labs;

import com.labs.AbstractCollection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();
        System.out.println(queue.size());
        System.out.println("--------------------------------");

        System.out.println(queue.offer("Hadi"));
        System.out.println(queue.offer("Prasetyo"));
        System.out.println(queue.offer("Andi"));
        System.out.println(queue.offer("Pratama"));

        System.out.println("--------------------------------");
        System.out.println(queue.size());

        System.out.println("Hanya Mengambail Data");
        System.out.println(queue.peek());

        System.out.println("Mengambil dan meremove");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("--------------------------------");
        System.out.println(queue.size());

    }
}
