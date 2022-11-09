package csc251.library;

import java.io.File;
import java.util.Map;

public class BookRepositoryWorker {

    public Map<String, Book> books;

    public boolean load(File authors, File books, BookRepository repo){
        return true;
    }

    public boolean save(File authors, File books, BookRepository repo){
        return true;
    }
}
