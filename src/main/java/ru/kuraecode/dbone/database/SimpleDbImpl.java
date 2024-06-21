package ru.kuraecode.dbone.database;

import ru.kuraecode.dbone.storage.Storage;

import java.nio.file.Path;

public class SimpleDbImpl implements DatabaseEngine {

    public final Storage storage;

    public SimpleDbImpl(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Path createDatabase(String databaseName) {
        return storage.createDatabaseDir(databaseName);
    }

    @Override
    public void insertRow() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
