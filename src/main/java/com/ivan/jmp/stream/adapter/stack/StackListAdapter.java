package com.ivan.jmp.stream.adapter.stack;

import java.util.List;

/**
 * Created by Ваня on 20.12.2015.
 */
public class StackListAdapter<T> implements Stack<T> {

    private List<T> list;

    public StackListAdapter(List<T> list) {
        this.list = list;
    }

    @Override
    public void push(T element) {
        list.add(element);
    }

    @Override
    public T pop() {
        return list.size() > 0 ? list.remove(list.size() - 1) : null;
    }
}
