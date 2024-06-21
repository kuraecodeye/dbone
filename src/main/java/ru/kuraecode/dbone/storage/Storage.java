package ru.kuraecode.dbone.storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Storage {

    public final Path basePath;

    public Storage(Path basePath) {
        this.basePath = basePath;
    }

    public Path createDatabaseDir(String databaseName) {
        try {
            Path resolved = basePath.resolve(databaseName);
            Files.createDirectory(resolved);
            return resolved;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
