package csc251.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class BookRepositoryWorker {

    public Map<String, Book> books;

    public boolean load(File authors, File book, BookRepository repo) throws IOException {
        Scanner scanner = new Scanner(book);
        Scanner scanner1 = new Scanner(authors);
        while (scanner.hasNextLine()) {

            String st = scanner.nextLine();
            String isbn = st.substring(0, 14);
            String title = st.substring(15, 79);
            title = title.replaceAll("\\s", "");
            System.out.println(title);
        }
        return true;
    }
    public boolean save(File authors, File books, BookRepository repo){
        return true;
    }
}
