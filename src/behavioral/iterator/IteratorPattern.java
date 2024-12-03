package behavioral.iterator;

public class IteratorPattern {
	
	    public static void main(String[] args) {
	        Library library = new Library();
	        library.addBook(new Book("1984", "George Orwell"));
	        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
	        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

	        BookIterator iterator = library.createIterator();

	        while (iterator.hasNext()) {
	            Book book = iterator.next();
	            System.out.println(book);
	        }
	    }
	}

