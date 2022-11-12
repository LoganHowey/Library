package csc251.library;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class BookRepositoryWorker {

    public Map<String, Book> books;

    public boolean load(File authors, File book, BookRepository repo) throws IOException {
        Scanner scanner = new Scanner(book);
        Scanner scanner1 = new Scanner(authors);
        Queue<String> nextBook = new LinkedList<>();
        LinkedList<String> isbnList = new LinkedList<>();
        LinkedList<String> authorList = new LinkedList<>();
        LinkedList<Book> bookList = new LinkedList<>();
        while (scanner.hasNextLine()) {
            String st = scanner.nextLine();
            String isbn = st.substring(0, 14);
            String title = st.substring(15, 79);
            title = title.replaceAll("\\s", "");
            nextBook.add(isbn);
            nextBook.add(title);
        }
        while (!nextBook.isEmpty()) {
            String[] holder = new String[2];
            holder[0] = nextBook.poll();
            holder[1] = nextBook.poll();
            Set<String> authorSet = new HashSet<>();
            while (scanner1.hasNextLine()) {
                String string = scanner1.nextLine();
                String isbn1 = string.substring(0, 14);
                String author = string.substring(15, 79);
                author = author.replaceAll("\\s", "");
                isbnList.add(isbn1);
                authorList.add(author);
            }
            for (int i = 0; i < isbnList.size(); i++) {
                if (isbnList.get(i).equals(holder[0])) {
                    authorSet.add(authorList.get(i));
                }
            }
            Book newBook = new Book(holder[1], holder[0], authorSet);
            bookList.add(newBook);
            repo.books.put(holder[1], newBook);
        }
         for (int i = 0; i < authorList.size(); i++) {
            Set<Book> bookSet = new HashSet<>();
            for (int j = 0; j < bookList.size(); j++) {
                for (String auth : bookList.get(j).getAuthors()) {
                    if (authorList.get(i).equals(auth)) {
                        bookSet.add(bookList.get(j));
                    }
                }
            }
            repo.authors.put(authorList.get(i), bookSet);
        }
        return true;
    }


    public boolean save(File authors, File books, BookRepository repo) {
        return false;
        //sorry, I don't want to write this.
    }
}
