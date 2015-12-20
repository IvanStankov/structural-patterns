package com.ivan.jmp.stream.adapter;

import com.ivan.jmp.stream.adapter.service.StackService;
import com.ivan.jmp.stream.adapter.stack.Stack;
import com.ivan.jmp.stream.adapter.stack.StackListAdapter;

import java.util.ArrayList;

/**
 * Created by Ваня on 20.12.2015.
 */
public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new StackListAdapter<>(new ArrayList<>());

        StackService<String> stringStackService = new StackService<>(stack);

        stringStackService.fillPushPop("One", "Two", "Three");
        stringStackService.print();
    }

}
