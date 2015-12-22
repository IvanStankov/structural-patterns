package com.ivan.jmp.stream.composite.impl.bridge;

import com.ivan.jmp.stream.composite.api.FSEntity;
import com.ivan.jmp.stream.composite.impl.Directory;
import com.ivan.jmp.stream.composite.impl.File;

/**
 * Created by Ваня on 23.12.2015.
 */
public class DirectoryTxtSaver extends TxtSaver {

    @Override
    public void saveInStore(FSEntity entity) {
        Directory directory = (Directory) entity;

        // save into txt file from super

        System.out.println("Directory " + directory.name() + " has saved into txt file");
    }
}
