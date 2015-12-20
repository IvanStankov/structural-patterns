package com.ivan.jmp.stream.proxy;

import com.ivan.jmp.stream.facade.service.api.PersonStoreService;
import com.ivan.jmp.stream.facade.service.impl.PersonStoreServiceImpl;

/**
 * Created by Ваня on 21.12.2015.
 */
public class PersonStoreServiceFactory {

    private static PersonStoreService personStoreService;

    public static PersonStoreService getPersonStoreService() {
        if (personStoreService == null) {
            personStoreService = new PersonStoreServiceProxy();
        }
        return personStoreService;
    }

}
