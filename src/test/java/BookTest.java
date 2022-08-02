import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;

    @Before
    public void setUp(){
        book1 = new Book("The Fellowship of the Ring", "J. R. R. Tolkien", "Fantasy");
    }
    @Test
    public void canGetBookTitle(){
        assertEquals("The Fellowship of the Ring", book1.getName());
    }
    @Test
    public void canGetBookAuthor(){
        assertEquals("J. R. R. Tolkien", book1.getAuthor());
    }
    @Test
    public void canGetBookGenre(){
        assertEquals("Fantasy", book1.getGenre());
    }

}
