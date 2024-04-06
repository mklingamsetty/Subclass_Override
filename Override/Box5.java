/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Murali Lingamsetty
 * @version 3/24/2022
 */
public class Box5 extends Rectangle5
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box5(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
   
    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + height;
    }
    
    public boolean equals(Rectangle5 o)
    {
    // instanceof is not in the AP Java subset
    if (!(o instanceof Box5))
    {
        return false;
    }      

    Box5 b = (Box5)o;
    return b.getLength() == getLength() && b.getWidth() == getWidth() && b.getHeight() == getHeight();
    }
}