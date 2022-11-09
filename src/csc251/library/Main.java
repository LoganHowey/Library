package csc251.library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> auth = new HashSet<>();
        auth.add("Hello");
        Set<String> auth2 = new HashSet<>();
        auth2.add("Frank Herbert");
        Book book1 = new Book("Book", "12341234", auth);
        Book book2 = new Book("Dune", "004112729", auth2);
        BookRepository repo = new BookRepository();
        repo.addBook(book1);
        repo.addBook(book2);
        System.out.println(repo.findBookByISBN("12341234").getAuthors());
        System.out.println(repo.getAuthors());
        }
}
