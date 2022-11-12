package csc251.library;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File books = new File("src/csc251/library/books.list");
        File authors = new File("src/csc251/library/authors.list");
        BookRepository repo = new BookRepository();
        BookRepositoryWorker worker = new BookRepositoryWorker();
        worker.load(authors, books, repo);
        repo.getBooks();
        System.out.println(repo.findBookByISBN("978-0201485677").getAuthors());
        System.out.println(repo.getAuthors());
        System.out.println(repo.findBookByAuthor("RobertCecilMartin"));
        }
}
