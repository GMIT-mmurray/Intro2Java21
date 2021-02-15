

public class TestIntersect {
    // Driver code
    public static void main(String[] args)
    {
        Intersect intersect = new Intersect();
        Point p1 = new Point(1, 1);
        Point q1 = new Point(10, 1);
        Point p2 = new Point(1, 2);
        Point q2 = new Point(10, 2);

        if(intersect.doIntersect(p1, q1, p2, q2))
            System.out.println("Yes");
        else
            System.out.println("No");

        p1 = new Point(10, 1); q1 = new Point(0, 10);
        p2 = new Point(0, 0); q2 = new Point(10, 10);
        if(intersect.doIntersect(p1, q1, p2, q2))
            System.out.println("Yes");
        else
            System.out.println("No");

        p1 = new Point(-5, -5); q1 = new Point(0, 0);
        p2 = new Point(1, 1); q2 = new Point(10, 10);;
        if(intersect.doIntersect(p1, q1, p2, q2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
