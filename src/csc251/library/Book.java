package csc251.library;

import java.util.Set;

public class Book {

    private String tile;
    private String isbn;
    private Set<String> author;

    public Book(String tile, String isbn, Set<String> author) {
        this.tile = tile;
        this.isbn = isbn;
        this.author = author;
    }

    public Book setTitle(String tile){
        this.tile = tile;
        return null;
    }

    public String getTile(){
        return this.tile;
    }

    public Book setISBN(){
        return null;
    }

    public String getISBN(){
        return this.isbn;
    }

    public Set<String> getAuthors(){
        return this.author;
    }

    public Book addAuthor(String author){
        return null;
    }
}
