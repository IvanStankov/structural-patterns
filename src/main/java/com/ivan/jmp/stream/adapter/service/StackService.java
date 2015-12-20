package com.ivan.jmp.stream.adapter.service;

import com.ivan.jmp.stream.adapter.stack.Stack;

import java.util.stream.Stream;

/**
 * Created by Ваня on 20.12.2015.
 */
public class StackService<T> {

    private Stack<T> stack;

    public StackService(Stack<T> stack) {
        this.stack = stack;
    }

    public void fillPushPop(T... objects) {
        Stream.of(objects).forEach(stack::push);
    }

    public void print() {
        T element = stack.pop();
        while (element != null) {
            System.out.println("Element: " + element);
            element = stack.pop();
        }
    }

}
