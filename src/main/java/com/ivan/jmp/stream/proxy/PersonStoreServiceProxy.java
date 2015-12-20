package com.ivan.jmp.stream.proxy;

import com.ivan.jmp.stream.facade.service.api.PersonStoreService;
import com.ivan.jmp.stream.facade.service.impl.PersonStoreServiceImpl;
import com.ivan.jmp.stream.model.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ваня on 21.12.2015.
 */
public class PersonStoreServiceProxy implements PersonStoreService {

    private PersonStoreService personStoreService;
    private Map<String, Person> personCache;

    @Override
    public void writePersons(Person... persons) {
        tryInit();
        personStoreService.writePersons(persons);
    }

    @Override
    public List<Person> readPersons() {
        tryInit();
        return personStoreService.readPersons();
    }

    @Override
    public Person readPerson(String name) {
        tryInit();
        Person person = personCache.get(name);
        if (person == null) {
            person = personStoreService.readPerson(name);
            personCache.put(name, person);
        }
        return person;
    }

    private void tryInit() {
        if (personStoreService == null) {
            personStoreService = new PersonStoreServiceImpl();
            personCache = new HashMap<>();
        }
    }
}
