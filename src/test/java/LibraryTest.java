import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;
    @Before
    public void beforeEach(){
        library = new Library("Three Book Library", 3);
        book1 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", "Fantasy");
        book2 = new Book("The Hobbit", "J. R. R. Tolkien", "Fantasy");
        book3 = new Book("Clean Code", "Robert Cecil Martin", "Non-Fiction");
    }

    @Test
    public void libraryHasName(){
        assertEquals("Three Book Library", library.getName());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void libraryStartsWithNoBooks(){
        assertEquals(0, library.getFill());
    }

    @Test
    public void libraryCanAddBooks(){
        library.addBook(book1);
        assertEquals(1, library.getFill());
    }

    @Test
    public void libraryCannotAddBooksIfOverCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book1);
        assertEquals(3, library.getFill());
    }
}
