import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        borrower = new Borrower("Jake");
        library = new Library(2);
        book1 = new Book("The Illiad", "Homer", "Greek Tragedy");
        book2 = new Book("The Odyssey", "Homer", "Greek Tragedy");
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void hasName(){
        assertEquals("Jake", borrower.getName());
    }

    @Test
    public void canCheckNumberOfBooksBorrowed(){
        assertEquals(0, borrower.numberOfBorrowedBooks());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library, book2);
        assertEquals(1, borrower.numberOfBorrowedBooks());
        assertEquals(1, library.bookCount());
    }
}
