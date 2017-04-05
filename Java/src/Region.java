/**
 * Created by shafai on 2017-04-03.
 */
public interface Region {
    double area();

    double perimeter();
}

class Circle implements Region {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius;
    }

    @Override
    public double perimeter() {

        return Math.PI * 2 * radius;
    }
}

class Rectangle2 implements Region {
    private double with;
    private double length;


    public Rectangle2(double with, double length) {
        this.length = length;
        this.with = with;
    }

    @Override
    public double area() {
        return length * with;
    }

    @Override
    public double perimeter() {
        return 2 * (length + with);
    }

    public String toString() {
        return "<" + this.with + this.with + this.area() + this.perimeter() + ">";
    }

    public static Rectangle2[] selectRectangle(Region[] region) {
        int countRect = 0;

        for (int i = 0; i < region.length; i++) {
            if (region[i]instanceof Rectangle2) {
                countRect++;
            }
        }
        Rectangle2[] rect = new Rectangle2[countRect];
        int posR = 0;
        for (int i = 0; i < region.length; i++) {
            if (region[i] instanceof Rectangle2) {
                rect[posR++] = (Rectangle2) region[i];
            }
        }
        return rect;
    }

    public static void main(String[] args) {
        Region[] region = {new Circle(5),
                new Rectangle2(2, 4),
                new Circle(2),
                new Rectangle2(7, 9),
                new Circle(6)

        };

        for (int i = 0; i < region.length; i++) {
            System.out.println(region[i].area() + region[i].perimeter());
        }

        Rectangle2[] rectangle2 = selectRectangle(region);


    }

}
