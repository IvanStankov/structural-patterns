package com.ivan.jmp.stream.facade;

import com.ivan.jmp.stream.facade.facade.PersonFacade;
import com.ivan.jmp.stream.facade.service.impl.IqService;
import com.ivan.jmp.stream.facade.service.impl.PersonStoreServiceImpl;
import com.ivan.jmp.stream.flyweight.PersonFactory;
import com.ivan.jmp.stream.model.Person;

/**
 * Created by Ваня on 20.12.2015.
 */
public class Main {

    public static void main(String[] args) {
        PersonFacade facade = new PersonFacade(new IqService(), new PersonStoreServiceImpl());

        PersonFactory personFactory = new PersonFactory();

        Person gandalf = personFactory.getPerson("Gandalf");
        gandalf.setAge(3450);
        gandalf.setIq(250);
        Person elrond = personFactory.getPerson("Elrond");
        elrond.setAge(7000);
        elrond.setIq(253);
        Person gimli = personFactory.getPerson("Gimli");
        elrond.setAge(54);
        elrond.setIq(100);

        facade.writePersons(gandalf, elrond, gimli);

        Person smartestPerson = facade.findSmartestPerson();
        System.out.println(smartestPerson);
    }

}
