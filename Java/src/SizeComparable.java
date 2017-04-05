/**
 * Created by shafai on 2017-03-25.
 */
public interface SizeComparable<T> {
    int sizeCompare(T o);
}

class Rectangle implements SizeComparable<Rectangle> {
    // the sides of the rectangle
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width*height;
    }

    @Override
    public int sizeCompare(Rectangle o) {
            if(this.area() < o.area())
        return -1;
            else if(this.area() == o.area())
                return 0;
            else
                return 1;
    }
/*
        sizeCompare compares this rectangle with a given
        rectangle according to their area.
        The method returns -1 if this rectangle is smaller,
            0 if the rectangles are equal, and 1 if this rectangle
        is greater.
        code is missing here

*/

}

class CharSequense implements SizeComparable<CharSequense> {
    public static final int CAPACITY = 1000;
    // the number of characters in the character sequence
    private int charCount;
    // characters in the character sequence
    private char[] characters = new char[CAPACITY];

    public CharSequense(char... characters) {
        for (int pos = 0; pos < characters.length; pos++)
            this.characters[pos] = characters[pos];
        charCount = characters.length;
    }

    public String toString() {
        String s = "";
        for (int pos = 0; pos < charCount; pos++)
            s = s + characters[pos];
        return s;
    }

    @Override
    public int sizeCompare(CharSequense o) {

        if(this.characters.length < o.characters.length)
            return -1;
        else if(this.characters.length==(characters.length))
            return 0;
        else
            return 1;
    }
/*
        sizeCompare compares this character sequence with a given
        character sequence according to their length (the number of characters).
        The method returns -1 if this character sequence is shorter,
0 if the character sequences are equal, and 1 if this
        character sequence is longer.
        code is missing here
        */
}

class Selector {
    public static <T extends SizeComparable<T>> T oneOfTwo(T object1, T object2) {
        T selected = object1;
        if (object2.sizeCompare(object1) > 0)
            selected = object2;
        return selected;
    }

    public static <T extends SizeComparable<T>> T oneOfMany(T[] objects) {
        T selected = objects[0];
        for (int pos = 1; pos < objects.length; pos++)
            if (objects[pos].sizeCompare(selected) > 0)
                selected = objects[pos];
        return selected;
    }


    public static void main(String[] args){
    CharSequense[] sequences = {
            new CharSequense('1', '1','1'),
            new CharSequense('1', '+','2','=','3'),
            new CharSequense('a', 'b', 'c','d'),
            new CharSequense('9', '9','9'),
            new CharSequense('0', '0','0', '0') };
        CharSequense seq = Selector.oneOfMany (sequences);
        System.out.println (seq);

    }
}