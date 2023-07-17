package com.labs.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;

    private List<String> genders;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
        this.genders = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void addGender(String gender) {
        genders.add(gender);
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getGenders(){
        return Collections.unmodifiableList(genders);
    }

    public String getName() {
        return name;
    }
}
