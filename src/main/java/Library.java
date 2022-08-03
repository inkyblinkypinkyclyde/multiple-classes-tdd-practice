import java.util.ArrayList;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> shelf;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.shelf = new ArrayList<Book>();
    }


    public String getName() {
        return this.name;
    }

    public int getFill() {
        return this.shelf.size();
    }

    public void addBook(Book book) {
        if (getFill()<capacity){
            this.shelf.add(book);
        }
    }
    public int getCapacity() {
        return this.capacity;
    }


    public Book lendBook(Book bookToBeFound) {
        int startingShelfLength = shelf.size();
        shelf.removeIf(n -> (n == bookToBeFound));
        int endingShelfLength = shelf.size();
        if (startingShelfLength != endingShelfLength){
            return bookToBeFound;
        }
        return null;
    }
}
