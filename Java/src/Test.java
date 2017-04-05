/**
 * Created by shafai on 2017-03-28.
 */
public class Test {
    public static void main(String[] args) {
        //System.out.println("hej");

            Point2 p1 = new Point2(1,1);
            Point2 p2 = new Point2(4,5);

            Line line = new Line(p1 , p2);


            System.out.println(line);
            System.out.println(line.length());
            System.out.println(line.midPoint());
        }

    }

