package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Person> personMap1 = new HashMap<>();
        Person person1 = new Person(12, "Damien", "Avila");
        Person person2 = new Person(13, "Rosella", "Burks");
        personMap1.put(12, person1);
        personMap1.put(13, person2);

        for(Map.Entry<Integer, Person> entry:personMap1.entrySet()){
            int key=entry.getKey();
            Person b=entry.getValue();
            System.out.println(b.getId()+" "+b.getName()+" "+b.getSurname());
        }
    }
}

