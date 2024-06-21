package ru.kuraecode.dbone.database;


import java.nio.file.Path;

public interface DatabaseEngine {

    Path createDatabase(String databaseName);

    void insertRow();

}
