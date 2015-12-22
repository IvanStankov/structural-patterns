package com.ivan.jmp.stream.composite.impl.bridge;

import com.ivan.jmp.stream.composite.api.FSEntity;
import com.ivan.jmp.stream.composite.api.FSEntitySaver;

/**
 * Created by Ваня on 23.12.2015.
 */
public abstract class DatabaseSaver implements FSEntitySaver {

    //there is defined connection to database
    protected Object dbConnection;

}
