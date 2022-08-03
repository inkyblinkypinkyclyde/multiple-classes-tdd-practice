import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower1;
    Borrower borrower2;
    Book book1;
    Book book2;
    Book book3;
    @Before
    public void beforeEach(){
        borrower1 = new Borrower("Jarrod", 1);
        borrower2 = new Borrower("John", 2);
        book1 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", "Fantasy");
        book2 = new Book("The Hobbit", "J. R. R. Tolkien", "Fantasy");
        book3 = new Book("Clean Code", "Robert Cecil Martin", "Non-Fiction");
    }
    @Test
    public void borrowerHasName(){
        assertEquals("Jarrod", borrower1.getName());
    }

    @Test
    public void borrowerHasCapacity() {
        assertEquals(1, borrower1.getCapacity());
    }

    @Test
    public void borrowerStartsWithEmptyShelf(){
        assertEquals(0, borrower1.getBorrowedLength());
    }

    @Test
    public void borrowerCanBorrow(){
        borrower1.borrow(book1);
        assertEquals(1, borrower1.getBorrowedLength());
    }
}
