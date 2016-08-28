import java.util.ArrayList;
import java.util.Random;

/**
 * Some College description
 * 
 * @author Oliver Walters (134730)
 * @version 1.0
 */
public class College
{
    private ArrayList<Student> studentList;
    private Library lib;
    private Random spin;
    
    /**
     * Constructor for objects of class College.
     * 
     * @param enrolled  input for total number of students enrolled.
     * @param totBooks  input for number of available books.
     */
    public College(int enrolled, int totBooks)
    {
        lib = new Library(totBooks);
        studentList = new ArrayList<Student>(enrolled);
        spin = new Random();
        for (int i = 0; i < enrolled; i++ )
        {
            String name = "student" + i;
            studentList.add(new Student(name, lib));
        }
    }

    /**
     * Displays a discription of the class in its current state
     */
    public void describe()
    {
        System.out.println("The college currently has " + studentList.size() + " hard working students");
        lib.describe();
    }

    /**
     * Displays text in the event of a student graduating, if there are no students remaining or
     * progresses the program further.
     */
    private void nextStep()
    {
        if(studentList.isEmpty())
        {
            System.out.println("Everything has gone very quiet");
        }
        else
        {
            int rN = spin.nextInt(studentList.size());
            Student s = studentList.get(rN);
            if(s.finishedStudies())
            {
                System.out.println("The student has graduated and left the college!");
                studentList.remove(rN);
            }
            else
            {
                studentList.get(rN).study();
            }
        }
    }
    
    /**
     * The base method for the programs functionality
     * 
     * @param nSteps    inputs the timeframe for the College to run.
     */
    public void runCollege(int nSteps)
    {
        for(int i=0; i < nSteps; i++)
        {
            System.out.println("Step " + (i+1));
            describe();
            nextStep();
        }
    }
    
    /**
     * The main method for the whole program. Allows the program to run outside of BlueJ.
     * 
     * @param String[] args     The parameters that govern the entire programs functionality.
     */
    public static void main(String[] args)
    {
        int a, b, c;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        College col = new College(a, b);
        col.runCollege(c);
    }
}
