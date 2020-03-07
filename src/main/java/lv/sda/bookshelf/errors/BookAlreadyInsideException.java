package lv.sda.bookshelf.errors;

public class BookAlreadyInsideException extends RuntimeException {

    public BookAlreadyInsideException(String message) {
        super(message);
    }
}
