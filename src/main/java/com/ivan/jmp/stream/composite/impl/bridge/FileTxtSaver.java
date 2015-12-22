package com.ivan.jmp.stream.composite.impl.bridge;

import com.ivan.jmp.stream.composite.api.FSEntity;
import com.ivan.jmp.stream.composite.impl.File;

/**
 * Created by Ваня on 23.12.2015.
 */
public class FileTxtSaver extends TxtSaver {

    @Override
    public void saveInStore(FSEntity entity) {
        File file = (File)entity;

        System.out.println("File " + file.name() + " saved into txt file");
    }
}
