
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Murali Lingamsetty
 * @version 3/24/2022
 */
public class Rectangle5
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle5(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    
    public String toString()
    {
        return "Rectangle - " + length + " X " + width;
    }
    
    public boolean equals(Rectangle5 o)
    {
     if (!(o instanceof Rectangle5))
        {
            return false;  
        }       

    Rectangle5 r = (Rectangle5)o;
    return r.getLength() == getLength() && r.getWidth() == getWidth();
    }
}
