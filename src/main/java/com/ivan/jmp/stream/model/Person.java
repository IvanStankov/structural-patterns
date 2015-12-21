package com.ivan.jmp.stream.model;

import java.io.Serializable;

/**
 * Created by Ваня on 20.12.2015.
 */
public class Person implements Serializable {

    private String name;
    private int age;
    private int iq;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int iq) {
        this.name = name;
        this.age = age;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                '}';
    }
}
