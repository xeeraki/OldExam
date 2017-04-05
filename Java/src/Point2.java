/**
 * Created by shafai on 2017-04-05.
 */

class Point2 {
    // the coordinates of the point
    private double x;
    private double y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // distance returns the distance between this point and a given point
    public double distance(Point2 p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) +
                (p.y - this.y) * (p.y - this.y));
    }

    public String toString() {

        return "(" + this.x + "," + this.y + ")";


    }

class Line {
    private Point2 startPoint2;
    private Point2 endPoint2;


    public Line(Point2 startPoint2, Point2 endPoint2) {
        this.startPoint2 = new Point2(startPoint2.x, startPoint2.y);
        this.endPoint2 = new Point2(endPoint2.x, endPoint2.y);
    }

    public String toString() {
        return "{" + "(" + this.startPoint2 + ")" + ","
                + "(" + this.endPoint2 + ")" + "}";
    }

    public double length() {
        return startPoint2.distance(endPoint2);
    }

    public double midPoint() {

        return startPoint2.distance(endPoint2) / 2;
    }


}

}
