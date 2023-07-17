package com.labs;

import com.labs.data.Person;

import java.util.List;

public class MutableListApp {
    public static void main(String[] args) {
        // secara default list itu mutable
        Person person = new Person("Hadi");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingWithHobby(person.getHobbies()); // problem pada mutable list "dapat menambahkan data lewat method ini"
//        doSomethingWithGender(person.getGenders()); // maka akan error ketika menambahkan data karena di jadikan immutable

        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }

    }

    // problem pada mutable list adalah dapat menambahkan data model padahal seharusnya tidak boleh sembarangan menambahkan data
    // contohnya pada method doSomethingWihtHobby berikut
    public static void doSomethingWithHobby(List<String> aneh) {
        aneh.add("Bukan Hobby"); // ini problemnya
    }

    public static void doSomethingWithGender(List<String> genders) {
        genders.add("new gender");
    }
}
