package com.labs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "hadi");
        map.put("email", "hadi@mail.com");
        map.put("score", "32");
        map.put("hobby", "Eat");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String val) {
                System.out.println(key + ": " + val);
            }
        });
    }
}
