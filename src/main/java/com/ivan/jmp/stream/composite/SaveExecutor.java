package com.ivan.jmp.stream.composite;

import com.ivan.jmp.stream.composite.impl.Directory;

/**
 * Created by Ваня on 23.12.2015.
 */
public class SaveExecutor {

    public static void save(Directory directory) {
        directory.save();
        directory.getSiblings().forEach(entity -> {
            if (entity instanceof Directory) {
                save((Directory) entity);
            } else {
                entity.save();
            }
        });
    }

}
