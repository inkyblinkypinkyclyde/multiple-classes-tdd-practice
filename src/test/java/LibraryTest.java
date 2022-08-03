import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Borrower borrower1;
    Borrower borrower2;
    Book book1;
    Book book2;
    Book book3;
    @Before
    public void beforeEach(){
        library = new Library("Three Book Library", 3);
        borrower1 = new Borrower("Jarrod", 1);
        borrower2 = new Borrower("John", 2);
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

//    @Test
//    public void canSearchForBookAndFindIt(){
//        library.addBook(book1);
//        assertEquals(book1, library.findBook(book1));
//    }
//
//    @Test
//    public void canSearchForABookAndNotFindIt(){
//        assertEquals(null, library.findBook(book1));
//    }

    @Test
    public void canLendOutBook(){
        library.addBook(book1);
        borrower2.borrow(library.lendBook(book1));
        assertEquals(0, library.getFill());
        assertEquals(1, borrower2.getBorrowedLength());
    }

    @Test
    public void cannotLendOutBook(){
        borrower2.borrow(library.lendBook(book1));
        assertEquals(0, library.getFill());
        assertEquals(0, borrower2.getBorrowedLength());
    }
}
