import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
  Book book;

  @Before
    public void before(){
      book = new Book("The Illiad", "Homer", "Greek tragedy");

  }

  @Test
    public void hasTitle(){
      assertEquals("The Illiad", book.getTitle());
  }

  @Test
   public void hasGenre(){
    assertEquals("Greek tragedy", book.getGenre());
  }

  @Test
  public void hasAuthor(){
    assertEquals("Homer", book.getAuthor());
  }
}
