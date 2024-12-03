package behavioral.iterator;
import java.util.List;

public class LibraryIterator implements BookIterator {
    private List<Book> books;
    private int position;

    public LibraryIterator(List<Book> books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more books to iterate.");
        }
        return books.get(position++);
    }
}

