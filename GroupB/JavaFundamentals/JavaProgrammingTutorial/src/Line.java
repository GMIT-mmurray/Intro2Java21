

/**
 * A Line composes of two Points - a begin "Point" and an end "Point".
 * We reuse the Point class via composition.
 */
public class Line {
    // The private instance variables
    Point begin, end;   // instances of the "Point" class

    /** Constructs a Line instance given 2 points at (x1, y1) and (x2, y2) */
    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);  // Construct the instances declared
        end   = new Point(x2, y2);
    }
    /** Construct a Line instance given 2 Point instances */
    public Line(Point begin, Point end) {
        this.begin = begin;  // The caller had constructed the instances
        this.end   = end;
    }

    // The public getter and setter for the private instance variables
    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {     return end; }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();  // Point's getX()
    }
    public void setBeginX(int x) {
        begin.setX(x);  // Point's setX()
    }
    public int getBeginY() {
        return begin.getY();  // Point's getY()
    }
    public void setBeginY(int y) {
        begin.setY(y);  // Point's setY()
    }
    public int[] getBeginXY() {
        return begin.getXY();  // Point's getXY()
    }
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);  // Point's setXY()
    }
    public int getEndX() {
        return end.getX();  // Point's getX()
    }
    public void setEndX(int x) {
        end.setX(x);  // Point's setX()
    }
    public int getEndY() {
        return end.getY();  // Point's getY()
    }
    public void setEndY(int y) {
        end.setY(y);  // Point's setY()
    }
    public int[] getEndXY() {
        return end.getXY();  // Point's getXY()
    }
    public void setEndXY(int x, int y) {
        end.setXY(x, y);  // Point's setXY()
    }

    /** Returns a self-descriptive String */
    public String toString() {
        return "Line[begin=" + begin + ",end=" + end + "]";
        // Invoke begin.toString() and end.toString()
    }

    /** Returns the length of this line */
    public double getLength() {
        return begin.distance(end);  // use Point's distance() method
    }

    public double getGradient() {
        //return Math.atan((end.getY() - begin.getY()) / (end.getX() - begin.getX()));
        return Math.atan((getEndY() - getBeginY()) / (getEndX() - getBeginX()));
    }

    // Given three colinear points p, q, r, the function checks if
// point q lies on line segment 'pr'
    private boolean onSegment(Point p, Point q, Point r)
    {
        if (q.getX() <= Math.max(p.getX(), r.getX()) && q.getX() >= Math.min(p.getX(), r.getX()) &&
                q.getY() <= Math.max(p.getY(), r.getY()) && q.getY() >= Math.min(p.getY(), r.getY()))
            return true;

        return false;
    }

    // To find orientation of ordered triplet (p, q, r).
// The function returns following values
// 0 --> p, q and r are colinear
// 1 --> Clockwise
// 2 --> Counterclockwise
    private  int orientation(Point p, Point q, Point r)   {
        // See https://www.geeksforgeeks.org/orientation-3-ordered-points/
        // for details of below formula.
        int val = (q.getY() - p.getY()) * (r.getX() - q.getX() -
                (q.getX() - p.getX()) * (r.getY() - q.getY()));

        if (val == 0) return 0; // colinear

        return (val > 0)? 1: 2; // clock or counterclock wise
    }

    // The main function that returns true if line segment 'p1q1'
// and 'p2q2' intersect.
    public boolean doIntersect(Point p2, Point q2)
    {
        // Find the four orientations needed for general and
        // special cases
        Point p1 = begin;
        Point q1 = end;

        int o1 = orientation(p1, q1, p2);
        int o2 = orientation(p1, q1, q2);
        int o3 = orientation(p2, q2, p1);
        int o4 = orientation(p2, q2, q1);

        // General case
        if (o1 != o2 && o3 != o4)
            return true;

        // Special Cases
        // p1, q1 and p2 are colinear and p2 lies on segment p1q1
        if (o1 == 0 && onSegment(p1, p2, q1)) return true;

        // p1, q1 and q2 are colinear and q2 lies on segment p1q1
        if (o2 == 0 && onSegment(p1, q2, q1)) return true;

        // p2, q2 and p1 are colinear and p1 lies on segment p2q2
        if (o3 == 0 && onSegment(p2, p1, q2)) return true;

        // p2, q2 and q1 are colinear and q1 lies on segment p2q2
        if (o4 == 0 && onSegment(p2, q1, q2)) return true;

        return false; // Doesn't fall in any of the above cases
    }
    public boolean doIntersect(Line l)
    {
        // Find the four orientations needed for general and
        // special cases
        Point p1 = begin;
        Point q1 = end;
        Point p2 = l.getBegin();
        Point q2 = l.getEnd();

        int o1 = orientation(p1, q1, p2);
        int o2 = orientation(p1, q1, q2);
        int o3 = orientation(p2, q2, p1);
        int o4 = orientation(p2, q2, q1);

        // General case
        if (o1 != o2 && o3 != o4)
            return true;

        // Special Cases
        // p1, q1 and p2 are colinear and p2 lies on segment p1q1
        if (o1 == 0 && onSegment(p1, p2, q1)) return true;

        // p1, q1 and q2 are colinear and q2 lies on segment p1q1
        if (o2 == 0 && onSegment(p1, q2, q1)) return true;

        // p2, q2 and p1 are colinear and p1 lies on segment p2q2
        if (o3 == 0 && onSegment(p2, p1, q2)) return true;

        // p2, q2 and q1 are colinear and q1 lies on segment p2q2
        if (o4 == 0 && onSegment(p2, q1, q2)) return true;

        return false; // Doesn't fall in any of the above cases
    }

}