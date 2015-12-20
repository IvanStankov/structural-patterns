package com.ivan.jmp.stream.facade.service.impl;

import com.ivan.jmp.stream.facade.service.api.PersonStoreService;
import com.ivan.jmp.stream.model.Person;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Ваня on 20.12.2015.
 */
public class PersonStoreServiceImpl implements PersonStoreService {
    private static final String FACADE_FILE = "./facade.txt";

    public void writePersons(Person... persons) {
        List<Person> personList = Stream.of(persons).collect(Collectors.toList());
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FACADE_FILE))) {
            outputStream.writeObject(personList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> readPersons() {
        List<Person> result = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FACADE_FILE))) {
            result = (List<Person>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Person readPerson(String name) {
        System.out.println("----------- Reading file -----------");
        return readPersons().stream()
                .filter(person -> name.equals(person.getName()))
                .findFirst()
                .get();
    }

}
