/**
 * Created by shafai on 2017-03-20.
 */
public class Rectangle {
    // the lengths of the rectangle’s sides
    private double    length;
    private double    width;

    // the rectangle’s color
    private String    color;

    public Rectangle (double length, double width, String color)
    {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getColor ()
    {
        return  color;
    }

    public double area ()
    {
        return length * width;

    }
    public String toString(){
        return "<"+this.length +", "+this.width+","+this.color+">";

    }

/*
    a) A static method, minRectangle, accepts an array of rectangles (objects of type Rectangle)
         and returns the rectangle with the smallest area. Create this method.
    b) A static method, selectRectangles, accepts an array of rectangles
         (objects of type Rectangle) and a color (an object of type String),
         and returns those rectangles (as an array) that are of the given color. Create this method.
    c) Create an array of rectangles (objects of type Rectangle).
         Then use the methods selectRectangles and minRectangle
         to determine the smallest of the rectangles in the array that are yellow.
  */
}


