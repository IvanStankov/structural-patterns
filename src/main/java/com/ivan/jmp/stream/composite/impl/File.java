package com.ivan.jmp.stream.composite.impl;

import com.ivan.jmp.stream.composite.api.FSEntity;
import com.ivan.jmp.stream.composite.api.FSEntitySaver;

/**
 * Created by Ваня on 20.12.2015.
 */
public class File implements FSEntity {

    private String name;
    private int size;

    private FSEntitySaver fsEntitySaver;

    public File(String name, int size, FSEntitySaver fsEntitySaver) {
        this.name = name;
        this.size = size;
        this.fsEntitySaver = fsEntitySaver;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void save() {
        fsEntitySaver.saveInStore(this);
    }
}
