package com.labs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> emptyMap = Collections.emptyMap();
        Map<String, String> singeton = Collections.singletonMap("name", "Hadi");

        Map<String, String> mutable = new HashMap<String, String>();
        mutable.put("name", "Prasetyo");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "fist", "Andi",
                "middle","Dita",
                "last", "Igun"
        );
        // map.put("fist", "Prasetyo"); // ERROR -> karena immutable
    }
}
