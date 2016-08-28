
/**
 * A class simulating a student for the College class.
 * 
 * @author Oliver Walters (134730)
 * @version 1.0
 */
public class Student
{
    private String studentName;
    private Library lender;
    private LibraryCard id;
    private TextBook book;

    /**
     * Constructor for objects of class Student.
     * 
     * @param name      input for the students name attribute.
     * @param library   input for the library class the student will be assigned to.
     */
    public Student(String name, Library library)
    {
        studentName = name;
        lender = library;
        id = lender.issueCard();
        book = null;
    }

    /**
     * Decides if the student has completed their studies.
     * 
     * @return  governs the value of whether the student has finished their studies.
     */
    public boolean finishedStudies()
    {
        return (book == null) && id.expired();
    }

    /**
     * Statement selects how the student will study.
     */
    public void study()
    {
        if(book == null)
        {
            book = lender.borrowBook(id);
        }
        else if(book.isFinished())
        {
            book.closeBook();
            lender.returnBook(book);
            book = null;
        }
        else
        {
            book.readNextChapter();
        }
    }

    /**
     * Describes the state of the student if envoked.
     */
    public void describe()
    {
        if(book == null)
        {
            System.out.print(studentName + " does not have a book on loan and ");
            id.describe();
        }
        else
        {
            System.out.println(studentName + " has book " + book + " on loan and ");
            id.describe();
        }
    }
}
