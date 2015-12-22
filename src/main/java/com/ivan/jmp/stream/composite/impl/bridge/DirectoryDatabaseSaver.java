package com.ivan.jmp.stream.composite.impl.bridge;

import com.ivan.jmp.stream.composite.api.FSEntity;
import com.ivan.jmp.stream.composite.impl.Directory;

/**
 * Created by Ваня on 23.12.2015.
 */
public class DirectoryDatabaseSaver extends DatabaseSaver {

    @Override
    public void saveInStore(FSEntity entity) {
        Directory directory = (Directory)entity;

        // do something with db connection

        System.out.println("Directory " + entity.name() + " has saved into database");
    }
}
