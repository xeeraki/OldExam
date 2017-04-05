import java.util.Arrays;

/**
 * Created by shafai on 2017-03-20.
 */
/*
    a) A static method, minRectangle, accepts an array of rectangles (objects of type RectangleR)
         and returns the rectangle with the smallest area. Create this method.
    b) A static method, selectRectangles, accepts an array of rectangles
         (objects of type RectangleR) and a color (an object of type String),
         and returns those rectangles (as an array) that are of the given color. Create this method.
    c) Create an array of rectangles (objects of type RectangleR).
         Then use the methods selectRectangles and minRectangle
         to determine the smallest of the rectangles in the array that are yellow.
  */
public class RectangleR {

    // the lengths of the rectangle’s sides
    private double length;
    private double width;

    // the rectangle’s color
    private String color;

    public RectangleR(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double area() {
        return length * width;

    }

    public String toString() {
        return "<" + this.length + ", " + this.width + "," + this.color + ">";

    }

    public static RectangleR minRectangle(RectangleR[] rect) {

        RectangleR min = rect[0];
        for (int i = 0; i < rect.length; i++) {
            if (rect[i].area() < min.area()) {
                min = rect[i];
            }
        }
        return min;

    }

    public static RectangleR[] selectRectangles(RectangleR[] rect, String color) {
        int countRect = 0;
        for (int i = 0; i < rect.length; i++) {
            if (rect[i].getColor().equals(color))
                countRect++;

        }

        RectangleR[] Rect = new RectangleR[countRect];
        int companionVar = 0;
        for (int j = 0; j < rect.length; j++) {
            if(rect[j].getColor().equals(color))
            Rect[companionVar++] = rect[j];
            //companionVar++; stackoverflow question

        }
        return Rect;
    }

    public static void main(String[] args) {
        RectangleR[] rect = {new RectangleR(2, 3, "yellow"),
                new RectangleR(3, 5, "red"),
                new RectangleR(1, 1, "yellow"),
                new RectangleR(2, 2, "red"),
                new RectangleR(3, 4, "red"),
                new RectangleR(2, 8, "red"),
                new RectangleR(5, 2, "yellow")};

        System.out.println("The smallest rectangle with yellow color is :" + minRectangle(rect));
        RectangleR[] rectangles = selectRectangles(rect, "yellow");
        System.out.println(Arrays.toString(rectangles));
    }

}


