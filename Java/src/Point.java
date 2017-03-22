import java.util.Arrays;

/**
 * Created by shafai on 2017-03-18.
 * <p>
 * a) A static method, nearestPoint , accepts an array of points (objects of type Point )
 * and one point (an object of type
 * Point ), and returns that point in the array which is
 * closest to the given point. Create that method.
 * b) A circle in the plane, with radius r and midpoint at the origin,
 * is given by the following equation:
 * x 2 + y 2 = r 2
 * A static method, internalPoints , accepts an array of points (objects of type Point )
 * and the radius of a circle, and returns
 * those points (in an array) that are inside the given circle. Create that method.
 * c) Create an array of points (objects of type Point ) and a point (an object of type Point ).
 * Establish also the radius of the
 * circle.
 * Use the method nearestPoint to determine the point in the array that is
 * closest to the given point. Then use the method
 * internalPoints to determine the points that are inside the circle.
 */
public class Point {
    // the coordinates of the point
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // distance returns the distance between this point and a given point
    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) +
                (p.y - this.y) * (p.y - this.y));
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < s.length(); i++) {
            s = "(" + this.x + "," + this.y + ")";
        }
        return s;
    }

    public static Point nearestPoint(Point[] points, Point point) {
        Point p = points[0];
        for (int i = 0; i < points.length; i++) {
            if (points[i].distance(point) < p.distance(point)) {
                p = points[i];
            }
        }
        return p;
    }

    public static Point[] internalPoints(Point[] points, double radius) {

        int countPoints = 0;
        for (int i = 0; i < points.length; i++) {
            double xp = points[i].getX();
            double yp = points[i].getY();
            // points are inside the circle if d^2 <= r^2
            // d^2 = (Xp-Xc)^2 + (Yp-Yc)^2
            // Xp and Yp is the point that should be checked
            // Xc and Xc is the point center (orgin)
            // Xc and Yc are 0 you end up with d^2 = (Xp-Xc)^2 + (Yp-Yc)^2
            if (xp * xp + yp * yp <= radius * radius) {
                countPoints++;
            }
        }
        int companionVar = 0;
        Point[] pointsInside = new Point[countPoints];
        for (int j = 0; j < countPoints; j++) {
            pointsInside[companionVar] = points[j];
            companionVar++;
        }
        return pointsInside;

    }

    public static void main(String[] args) {
        Point[] points = {new Point(1, 2),
                new Point(2, 3),
                new Point(5, 2)};

        Point point = new Point(1, 1);
        double r = 7;
        Point nearestPoint = nearestPoint(points, point);
        Point[] internalPoints = internalPoints(points, 7);
        System.out.println(nearestPoint + "   " + Arrays.toString(internalPoints));
    }

}


