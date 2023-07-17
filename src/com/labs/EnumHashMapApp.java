package com.labs;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }
    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Andi");
        map.put(Level.VIP, "Hadi");
        map.put(Level.STANDARD, "Prasetyo");

        System.out.println(map.get(Level.PREMIUM));
        System.out.println("--------------------------------");

        for(var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
