package lv.sda.bookshelf;

import lv.sda.bookshelf.errors.BookNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Book book1 = new Book("1234567890", "Story Of My Life", "Unknown", 10);
        Book book2 = new Book("0987654321", "Story Of Your Life", "Unknown", 100);
        Book book3 = new Book("6574839301", "Life Of Both Of You", "Stalker", 99);
        Book book4 = new Book("6574839302", "Life Of None Of You", "Dreamer", 200);

        Bookshelf bookshelf = new Bookshelf();
        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book3);
//        bookshelf.add(book4);

        try {
            bookshelf.remove(book4);
        } catch (BookNotFoundException e) {
            log.error("Book can't be removed: ", e);
        }

        List<String> filteredBooks = bookshelf.getBooks().stream()
                .filter(book -> book.getPages() > 100)
                .map(book -> book.getAuthor() + " " + book.getTitle())
                .collect(Collectors.toList());

        filteredBooks.forEach(log::info);
    }
}
