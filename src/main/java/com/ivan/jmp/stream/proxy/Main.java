package com.ivan.jmp.stream.proxy;

import com.ivan.jmp.stream.facade.service.api.PersonStoreService;
import com.ivan.jmp.stream.model.Person;

/**
 * Created by Ваня on 21.12.2015.
 */
public class Main {

    public static void main(String[] args) {
        PersonStoreService personStoreService = PersonStoreServiceFactory.getPersonStoreService();

        personStoreService.writePersons(new Person("Gandalf", 3450, 250), new Person("Elrond", 7000, 253),
                new Person("Gimli", 54, 85));

        Person gandalf = personStoreService.readPerson("Gandalf");
        System.out.println(gandalf);

        Person gandalfSecondTry = personStoreService.readPerson("Gandalf");
        System.out.println(gandalfSecondTry);
    }
}
