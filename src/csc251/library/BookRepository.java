package csc251.library;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BookRepository{

    public Map<String, Set<Book>> authors;
    public Map<String , Book> books;

    public BookRepository(){
        this.authors = new HashMap<>();
        this.books = new HashMap<>();
    }

    public boolean addBook(Book book){
        if (book != null && book.getTile() != null && book.getAuthors() != null){
            books.put(book.getTile(), book);
            return true;
        }
        return false;
    }

    public Set<Book> getBooks(){
        Set<Book> allBooks = null;
        for (Map.Entry<String, Book> entry: books.entrySet()){
            allBooks.add(entry.getValue());
            System.out.println(entry.getValue().getTile());
        }
        return allBooks;
    }

    public Set<String> getAuthors(){
        Set<String> allAuthors = null;
        for (Map.Entry<String, Set<Book>> entry: authors.entrySet()){
            allAuthors.add(entry.getKey());
        }
        return allAuthors;
    }

    public Book findBookByISBN(String isbn){
        for (Map.Entry<String, Book> entry: books.entrySet()){
            Book book = entry.getValue();
            if (book.getISBN() == isbn){
                return book;
            }
        }
        System.out.println("No book with ISBN(" + isbn + ")");
        return null;
    }

    public Set<Book> findBookByAuthor(String author){
        return null;
    }
}
