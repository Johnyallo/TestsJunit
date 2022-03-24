package OnlineBookTests;

import OnlineBook.Author;
import OnlineBook.Book;
import OnlineBook.User;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnlineBooksTests {
    @BeforeEach
    public void started() {
        System.out.println("Test is started.");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("All are started");
    }

    @Test
    public void testIsGoodBook() {
        //given
        Author author1 = new Author("Gregori David", "Roberts", 1952, "Ausrtalia");
        Book shantaram = new Book("Shantaram", author1, 1991, 1300, 3);
        boolean expected = true;

        //when
        boolean result = Book.isGoodBook(shantaram);

        //then
        assertEquals(expected, result);
    }

    @Test
    public void testWhatIsBigger() {
        //given
        Author author2 = new Author("Jack", "London", 1876, "England");
        Author author3 = new Author("Andrey", "Platonov", 1899, "USSR");
        Book martinEden = new Book("Martin Eden", author2, 1909, 350, 5);
        Book kotlovan = new Book("Kotlovan", author3, 1930, 240, 55);
        String expected = "Martin Eden bigger than Kotlovan";

        //when
        String result = Book.whatIsBigger(martinEden, kotlovan);

        //then
        assertEquals(expected, result);
    }

    @Test
    public void testCountOfUsers() {
        //given
        Author author1 = new Author("Gregori David", "Roberts", 1952, "Ausrtalia");
        Author author2 = new Author("Jack", "London", 1876, "England");
        Book shantaram = new Book("Shantaram", author1, 1991, 1300, 3);
        Book martinEden = new Book("Martin Eden", author2, 1909, 350, 5);
        User ivanov = new User("ivanov@mail.ru", "Viktor", "Ivanov", shantaram);
        User petrov = new User("petrov@mail.ru", "Ismail", "Petrov", martinEden);
        int expected = 2;

        //when
        int result = User.countOfUsers();

        //then
        assertEquals(expected, result);

    }
}
