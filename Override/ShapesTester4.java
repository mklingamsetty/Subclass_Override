
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