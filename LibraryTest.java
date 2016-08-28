import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LibraryTest.
 *
 * @author  Oliver Walters (134730)
 * @version 1.0
 */
public class LibraryTest
{
    /**
     * Default constructor for test class LibraryTest
     */
    public LibraryTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testIssueCard()
    {
        Library library1 = new Library(10);
        LibraryCard libraryC1 = library1.issueCard();
        assertNotNull(libraryC1);
    }

    @Test
    public void testBorrowBook()
    {
        Library library1 = new Library(10);
        LibraryCard libraryC1 = library1.issueCard();
        TextBook textBook1 = library1.borrowBook(libraryC1);
        assertNotNull(textBook1);
    }

    @Test
    public void testNullBook()
    {
        Library library1 = new Library(0);
        LibraryCard libraryC1 = new LibraryCard(1, 5);
        assertNull(library1.borrowBook(libraryC1));
    }
}    