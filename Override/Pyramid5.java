/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Murali Lingamsetty
 * @version 3/24/2022
 */
public class Pyramid5 extends Rectangle5
{
    private int height;
    // Constructor for objects of class Box
    public Pyramid5(int l, int w, int h)
    {
        // call superclass
        super(l, w);
        height = h;
    }
    
    public int getHeight()
    {
        return height;
    }

    public String toString()
    {
        return "Pyramid - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    
}