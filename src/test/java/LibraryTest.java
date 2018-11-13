import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("The Illiad", "Homer", "Greek Tragedy");
        book2 = new Book("The Odyssey", "Homer", "Greek Tragedy");
        book3 = new Book("Hercules", "Disney", "Mythology");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBookWhenFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.bookCount());

    }

    @Test
    public void hasCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canCheckIfFull(){
        library.addBook(book2);
        library.addBook(book1);
        assertEquals(true, library.checkIfFull());
    }

    @Test
    public void canCheckIfFull__NotFull(){
        assertEquals(false, library.checkIfFull());
    }

    @Test
    public void canLendBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.lendBook(book2);
    }
}
