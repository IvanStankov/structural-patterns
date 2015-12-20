package com.ivan.jmp.stream.facade.service.api;

import com.ivan.jmp.stream.model.Person;

import java.util.List;

/**
 * Created by Ваня on 21.12.2015.
 */
public interface PersonStoreService {

    void writePersons(Person... persons);

    List<Person> readPersons();

    Person readPerson(String name);

}
