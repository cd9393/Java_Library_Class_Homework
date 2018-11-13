import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book1) {
        if(bookCount() < this.capacity) {
            this.books.add(book1);
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean checkIfFull() {
        if(bookCount() < this.capacity){
            return false;
        }else{
            return true;
        }
    }

    public Book lendBook(Book book2) {
        int indexOfBook =  this.books.indexOf(book2);
        return this.books.remove(indexOfBook);
    }
}
