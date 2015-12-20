package com.ivan.jmp.stream.facade.service.impl;

import com.ivan.jmp.stream.model.Person;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Ваня on 20.12.2015.
 */
public class IqService {

    public Person findSmartestPerson(List<Person> persons) {
        return persons.stream().max((o1, o2) -> o1.getIq() - o2.getIq()).get();
    }

}
