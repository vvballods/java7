import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Book book1 = new Book("1234567890", "Story Of My Life", "Unknown", 10);
        Book book2 = new Book("0987654321", "Story Of Your Life", "Unknown", 100);
        Book book3 = new Book("6574839301", "Life Of Both Of You", "Stalker", 99);
        Book book4 = new Book("6574839302", "Life Of None Of You", "Dreamer", 100);

        Bookshelf bookshelf = new Bookshelf();
        bookshelf.add(book1);
        bookshelf.add(book2);
        bookshelf.add(book4);
        bookshelf.add(book3);

        bookshelf.getBooks().forEach(book -> log.info(book.getTitle()));
    }
}
