/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Murali Lingamsetty
 * @version 3/24/2022
 */
public class Cube5 extends Box5
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Cube4
     */
    public Cube5(int l, int w, int h)
    {
        // initialise instance variables
        super(l, w, h);
    }

    public String toString()
    {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
