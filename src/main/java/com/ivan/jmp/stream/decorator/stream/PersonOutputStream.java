package com.ivan.jmp.stream.decorator.stream;

import com.ivan.jmp.stream.model.Person;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by Ваня on 20.12.2015.
 */
public class PersonOutputStream extends ObjectOutputStream {

    public PersonOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public void writePerson(Person person) throws IOException {
        if (person != null && person.getName() != null && person.getName().trim().length() > 0
                && Character.isLowerCase(person.getName().trim().charAt(0))) {
            char[] stringArray = person.getName().trim().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            person.setName(new String(stringArray));
        }
        writeObject(person);
    }
}
