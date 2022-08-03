import java.util.ArrayList;

public class Borrower {
    private String name;
    private int capacity;
    public ArrayList<Book> shelf;
    public Borrower(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.shelf = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBorrowedLength() {
        return shelf.size();
    }

    public void borrow(Book book) {
        if (book != null){
            if (getCapacity()>getBorrowedLength()){
                shelf.add(book);
            }
        }
    }
}
