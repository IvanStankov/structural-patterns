package com.ivan.jmp.stream.decorator.stream;

import com.ivan.jmp.stream.model.Person;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * Created by Ваня on 20.12.2015.
 */
public class PersonInputStream extends ObjectInputStream {

    public PersonInputStream(InputStream in) throws IOException {
        super(in);
    }

    public Person readPerson() throws IOException, ClassNotFoundException {
        Person person = (Person)readObject();
        if (person.getName() != null && person.getName().trim().length() > 0 &&
                Character.isUpperCase(person.getName().trim().charAt(0))) {
            char[] stringArray = person.getName().trim().toCharArray();
            stringArray[0] = Character.toLowerCase(stringArray[0]);
            person.setName(new String(stringArray));
        }
        return person;
    }

}
