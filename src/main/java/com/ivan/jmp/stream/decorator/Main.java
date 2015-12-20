package com.ivan.jmp.stream.decorator;

import com.ivan.jmp.stream.model.Person;
import com.ivan.jmp.stream.decorator.stream.PersonInputStream;
import com.ivan.jmp.stream.decorator.stream.PersonOutputStream;

import java.io.*;

/**
 * Created by Ваня on 20.12.2015.
 */
public class Main {

    private static final String DECORATOR_FILE = "./decorator.txt";

    public static void main(String[] args) {

        try {
            PersonOutputStream pos =
                    new PersonOutputStream(new ObjectOutputStream(new FileOutputStream(DECORATOR_FILE)));
            pos.writePerson(new Person("john", 32));
            pos.close();

            PersonInputStream pis =
                    new PersonInputStream(new ObjectInputStream(new FileInputStream(DECORATOR_FILE)));
            Person person = pis.readPerson();
            pis.close();

            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
