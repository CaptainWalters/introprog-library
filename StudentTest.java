

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StudentTest.
 *
 * @author  Oliver Walters (134730)
 * @version 1.0
 */
public class StudentTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest()
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
    public void testFinished()
    {
        Library library1 = new Library(10);
        Student student1 = new Student("bill", library1);
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        student1.study();
        assertEquals(true, student1.finishedStudies());
    }
    
    @Test
    public void testNotFinished()
    {
        Library library1 = new Library(10);
        Student student1 = new Student("bob", library1);
        student1.study();
        assertEquals(false, student1.finishedStudies());
    }

}


