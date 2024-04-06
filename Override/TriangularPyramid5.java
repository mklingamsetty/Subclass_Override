/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Murali Lingamsetty
 * @version 3/24/2022
 */
public class TriangularPyramid5 extends Pyramid5
{
    // instance variables
    // Constructor for objects of class Box
    public TriangularPyramid5(int l, int b, int h)
    {
        // call superclass
        super(l, b, h);
    }

    // String to display when object is printed.
   
    public String toString()
    {
        return "Triangular Pyramid - " + getHeight() + " X " + getWidth() + " X " + getLength();
    }
    
}