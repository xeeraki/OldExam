
/**
 * Created by shafai on 2017-03-23.
 */
public class Course {

    // course number and name
    private int number;
    private String name;

    public Course(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String toString() {
        return "<" + this.number + ", " + this.name + ">";
    }

    // equals returns true if the course is equal
// to a given course, and false otherwise.
    public boolean equals(Course course) {
        return this.number == course.number
                && this.name.equals(course.name);
    }
}

