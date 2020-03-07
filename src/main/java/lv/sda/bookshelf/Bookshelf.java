package lv.sda.bookshelf;

import lv.sda.bookshelf.errors.BookAlreadyInsideException;
import lv.sda.bookshelf.errors.BookNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        if (books.contains(book)) {
            throw new BookAlreadyInsideException("Book with isbn" + book.getIsbn() + " is already inside!");
        }
        books.add(book);
    }

    public void remove(Book book) {
        if (!books.contains(book)) {
            throw new BookNotFoundException("Book with isbn" + book.getIsbn() + " is not inside!");
        }
        books.remove(book);
    }
}
