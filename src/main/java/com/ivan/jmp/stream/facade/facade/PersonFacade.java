package com.ivan.jmp.stream.facade.facade;

import com.ivan.jmp.stream.facade.service.impl.IqService;
import com.ivan.jmp.stream.facade.service.impl.PersonStoreServiceImpl;
import com.ivan.jmp.stream.model.Person;

import java.util.List;

/**
 * Created by Ваня on 20.12.2015.
 */
public class PersonFacade {

    private IqService iqService;
    private PersonStoreServiceImpl personStoreService;

    public PersonFacade(IqService iqService, PersonStoreServiceImpl personStoreService) {
        this.iqService = iqService;
        this.personStoreService = personStoreService;
    }

    public void writePersons(Person... persons) {
        personStoreService.writePersons(persons);
    }

    public Person findSmartestPerson() {
        List<Person> persons = personStoreService.readPersons();
        return iqService.findSmartestPerson(persons);
    }
}
