package com.ivan.jmp.stream.composite;

import com.ivan.jmp.stream.composite.api.FSEntitySaver;
import com.ivan.jmp.stream.composite.impl.Directory;
import com.ivan.jmp.stream.composite.impl.File;
import com.ivan.jmp.stream.composite.impl.bridge.DirectoryDatabaseSaver;
import com.ivan.jmp.stream.composite.impl.bridge.DirectoryTxtSaver;
import com.ivan.jmp.stream.composite.impl.bridge.FileDatabaseSaver;
import com.ivan.jmp.stream.composite.impl.bridge.FileTxtSaver;

/**
 * Created by Ваня on 20.12.2015.
 */
public class Main {

    public static void main(String[] args) {
        Directory root = new Directory("/", getDirectorySaver());
        root.add(new File("readme.txt", 180, getFileSaver()));

        Directory pictures = new Directory("pictures", getDirectorySaver());
        pictures.add(new File("family.jpeg", 900, getFileSaver()));
        pictures.add(new File("car.jpeg", 1024, getFileSaver()));

        Directory cats = new Directory("cats", getDirectorySaver());
        cats.add(new File("cat.png", 700, getFileSaver()));
        cats.add(new File("kitty.png", 564, getFileSaver()));

        Directory dogs = new Directory("dogs", getDirectorySaver());
        dogs.add(new File("dog.jpg", 800, getFileSaver()));
        dogs.add(new File("puppy.jpg", 953, getFileSaver()));

        pictures.add(cats);
        pictures.add(dogs);
        root.add(pictures);

        Directory letters = new Directory("letters", getDirectorySaver());
        letters.add(new File("price.xls", 2564, getFileSaver()));
        letters.add(new File("Rent.rtf", 547, getFileSaver()));
        root.add(letters);

        DirectoryPrinter printer = new DirectoryPrinter();
        printer.print(root);

        SaveExecutor.save(root);
    }

    private static FSEntitySaver getDirectorySaver() {
        return System.currentTimeMillis() % 2 == 0 ? new DirectoryDatabaseSaver() : new DirectoryTxtSaver();
    }

    private static FSEntitySaver getFileSaver() {
        return System.currentTimeMillis() % 2 == 0 ? new FileDatabaseSaver() : new FileTxtSaver();
    }
}
