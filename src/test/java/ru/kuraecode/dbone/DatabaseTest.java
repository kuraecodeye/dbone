package ru.kuraecode.dbone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import ru.kuraecode.dbone.database.DatabaseEngine;
import ru.kuraecode.dbone.database.SimpleDbImpl;
import ru.kuraecode.dbone.storage.Storage;

import java.nio.file.Files;
import java.nio.file.Path;

public class DatabaseTest {

    @Test
    public void createDatabaseWithGivenNameShouldOK(@TempDir Path path) {
        DatabaseEngine de = new SimpleDbImpl(new Storage(path));
        Assertions.assertTrue(Files.exists(de.createDatabase("Temp Database")));
    }

    @Test
    public void insertRowIntoDatabaseShouldOK(@TempDir Path path) {
        DatabaseEngine de = new SimpleDbImpl(new Storage(path));
        de.insertRow();
    }

}
