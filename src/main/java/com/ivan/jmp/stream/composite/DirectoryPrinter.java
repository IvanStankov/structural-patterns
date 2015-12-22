package com.ivan.jmp.stream.composite;

import com.ivan.jmp.stream.composite.api.FSEntity;
import com.ivan.jmp.stream.composite.impl.Directory;

/**
 * Created by Ваня on 20.12.2015.
 */
public class DirectoryPrinter {

    public void print(Directory directory) {
        print(directory, "");
    }

    private void print(Directory directory, String offset) {
        directory.getSiblings().forEach(entity -> {
            System.out.println(offset + entity.name() + " " + entity.size() + "kB" + " ");
            if (entity instanceof Directory) {
                print((Directory) entity, offset + "  ");
            }
        });
    }

}
