package com.labs;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Mengirim Data
        stack.push("Hadi");
        stack.push("Prasetyo");
        stack.push("Dita");

        // Mengambil data yg paling atasnya
        // stack.pop();

        try {
            for (var value = stack.pop(); value != null; value = stack.pop()) {
                System.out.println(value);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
