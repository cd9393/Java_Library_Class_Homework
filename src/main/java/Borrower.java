import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int numberOfBorrowedBooks() {
        return this.borrowedBooks.size();
    }

    public void addBook(Book book){
        this.borrowedBooks.add(book);
    }

    public void borrowBook(Library library, Book book2) {
      Book borrowedBook = library.lendBook(book2);
      addBook(borrowedBook);
    }
}
