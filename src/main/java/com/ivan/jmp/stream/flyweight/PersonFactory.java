package com.ivan.jmp.stream.flyweight;

import com.ivan.jmp.stream.model.Person;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ivan_Stankov on 21.12.2015.
 */
public class PersonFactory {

    private Map<String, Person> cache = new HashMap<>();

    public Person getPerson(String name) {
        if (!cache.containsKey(name)) {
            cache.put(name, new Person(name));
        }
        return cache.get(name);
    }

}
