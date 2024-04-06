------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all they need to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:3/24/2022
HOW TO START THIS PROJECT:
AUTHORS: Murali Lingamsetty
USER INSTRUCTIONS:


/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Murali Lingamsetty
 * @version 3/24/2022
 */
import java.util.*;
public class ShapesTester4
{
    public static void main(String []args)
    {
        System.out.println("My Shapes: ");
        System.out.println();     
        
        Rectangle5 one = new Rectangle5(12, 20);
        Rectangle5 two = new Box5(4, 4, 4);
        Rectangle5 three = new Box5(4, 12, 8);
        Rectangle5 four = new Cube5(4, 4, 4);
        Rectangle5 five = new Pyramid5(18, 1, 1);
        Rectangle5 six = new TriangularPyramid5(12, 1, 1);
        Rectangle5 seven = new TriangularPyramid5(6, 3, 4);
        
        //Print all shapes
        ArrayList<Rectangle5> shapes = new ArrayList<Rectangle5>();

        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        shapes.add(five);
        shapes.add(six);
        shapes.add(seven);

        for(Rectangle5 rect: shapes)
        {
            System.out.println(rect);
            //showEffectBoth(rect);
            System.out.println();
        }
        
        System.out.println(testEquality(two, four) + "\n");
        System.out.println(testEquality(two, three));
    }

    public static void showEffectBoth(Rectangle5 r)
    {
        System.out.println(r);
    }
    
    public static String testEquality(Rectangle5 a, Rectangle5 b)
    {
        String equality = " ";
        
        if(a.equals(b) == false)
        {
            equality = a.toString() + " is NOT equal to " + b.toString();
        }
        else
        {
            equality = a.toString() + " IS equal to " + b.toString();
        }
        
        return equality;
    }
    
}

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
