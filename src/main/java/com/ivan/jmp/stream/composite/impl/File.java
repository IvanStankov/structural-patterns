package com.ivan.jmp.stream.composite.impl;

import com.ivan.jmp.stream.composite.api.FSEntity;

/**
 * Created by Ваня on 20.12.2015.
 */
public class File implements FSEntity {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int size() {
        return size;
    }
}
