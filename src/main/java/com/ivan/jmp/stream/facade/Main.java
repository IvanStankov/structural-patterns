package com.ivan.jmp.stream.facade;

import com.ivan.jmp.stream.facade.facade.PersonFacade;
import com.ivan.jmp.stream.facade.service.impl.IqService;
import com.ivan.jmp.stream.facade.service.impl.PersonStoreServiceImpl;
import com.ivan.jmp.stream.model.Person;

/**
 * Created by Ваня on 20.12.2015.
 */
public class Main {

    public static void main(String[] args) {
        PersonFacade facade = new PersonFacade(new IqService(), new PersonStoreServiceImpl());

        facade.writePersons(new Person("Gandalf", 3450, 250), new Person("Elrond", 7000, 253),
                new Person("Gimli", 54, 85));

        Person smartestPerson = facade.findSmartestPerson();
        System.out.println(smartestPerson);
    }

}
