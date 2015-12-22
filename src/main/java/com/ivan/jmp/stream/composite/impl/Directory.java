package com.ivan.jmp.stream.composite.impl;

import com.ivan.jmp.stream.composite.api.FSEntity;
import com.ivan.jmp.stream.composite.api.FSEntitySaver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Ваня on 20.12.2015.
 */
public class Directory implements FSEntity {

    private List<FSEntity> siblings = new ArrayList<>();
    private String name;

    private FSEntitySaver fsEntitySaver;

    public Directory(String name, FSEntitySaver fsEntitySaver) {
        this.name = name;
        this.fsEntitySaver = fsEntitySaver;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int size() {
        return siblings.stream().mapToInt(elem -> elem.size()).sum();
    }

    public void add(FSEntity entity) {
        siblings.add(entity);
    }

    public void remove(FSEntity entity) {
        siblings.remove(entity);
    }

    public List<FSEntity> getSiblings() {
        return siblings;
    }

    @Override
    public void save() {
        fsEntitySaver.saveInStore(this);
    }
}
