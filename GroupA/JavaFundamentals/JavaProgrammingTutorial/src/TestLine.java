import java.util.Arrays;
/**
 * A Test Driver for the Line class.
 */
public class TestLine {
    public static void main(String[] args) {
        // Test constructor and toString()
        Line l1 = new Line(1, 2, 3, 4);
        System.out.println(l1);  // Line's toString()
        //Line[begin=(1,2),end=(3,4)]
        Line l2 = new Line(new Point(5,6), new Point(7,8));  // anonymous Point's instances
        System.out.println(l2);  // Line's toString()
        //Line[begin=(5,6),end=(7,8)]

        // Test Setters and Getters
        l1.setBegin(new Point(11, 12));
        l1.setEnd(new Point(13, 14));
        System.out.println(l1);  // Line's toString()
        //Line[begin=(11,12),end=(13,14)]
        System.out.println("begin is: " + l1.getBegin());  // Point's toString()
        //begin is: (11,12)
        System.out.println("end is: " + l1.getEnd());  // Point's toString()
        //end is: (13,14)

        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);  // Line's toString()
        //Line[begin=(21,22),end=(23,24)]
        System.out.println("begin's x is: " + l1.getBeginX());
        //begin's x is: 21
        System.out.println("begin's y is: " + l1.getBeginY());
        //begin's y is: 22
        System.out.println("end's x is: " + l1.getEndX());
        //end's x is: 23
        System.out.println("end's y is: " + l1.getEndY());
        //end's y is: 24

        l1.setBeginXY(31, 32);
        l1.setEndXY(33, 34);
        System.out.println(l1);  // Line's toString()
        //Line[begin=(31,32),end=(33,34)]
        System.out.println("begin's x and y are: " + Arrays.toString(l1.getBeginXY()));
        //begin's x and y are: [31, 32]
        System.out.println("end's x and y are: " + Arrays.toString(l1.getEndXY()));
        //end's x and y are: [33, 34]

        // Test getLength()
        System.out.printf("length is: %.2f%n", l1.getLength());
        //length is: 2.83
        // Test get slope in radians
        System.out.printf("Slope is: %.2f radians %n", l1.getGradient());
        System.out.printf("Slope is: %.2f radians %n", l2.getGradient());

        Point p1 = new Point(1, 1);
        Point q1 = new Point(10, 1);
        Point p2 = new Point(1, 2);
        Point q2 = new Point(10, 2);

        if(l1.doIntersect(p1, q1, p2, q2))
            System.out.println("Yes");
        else
            System.out.println("No");

        p1 = new Point(10, 1);
        q1 = new Point(0, 10);
        p2 = new Point(0, 0);
        q2 = new Point(10, 10);

        if(l2.doIntersect(p1, q1, p2, q2))
            System.out.println("Yes");
        else
            System.out.println("No");

        if(l2.doIntersect(p2, q2))
            System.out.println("Yes");
        else
            System.out.println("No");

        if(l1.doIntersect(p1, q1))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
