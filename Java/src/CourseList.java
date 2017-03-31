
/**
 * Created by shafai on 2017-03-23.
 */
public class CourseList {

    private static final int CAPACITY = 5;
    // courses
    private Course[] courses;
    // the number of courses
    private int courseCount;

    public CourseList() {
        courses = new Course[CAPACITY];
        courseCount = 0;
    }

    // add adds a course to the list
    public void add(Course course) {
        courses[courseCount] = course;
        courseCount++;
    }
    public void remove (Course course) {
        int courseIndex = -1;
        for (int pos = 1; pos < courseCount; pos++)
            if (courses[pos].equals(course)) {
                courseIndex = pos;
                break;
            }
        if (courseIndex != -1) {
            for (int pos = courseIndex; pos < courseCount - 1; pos++)
                courses[pos] = courses[pos + 1];
            courses[courseCount - 1] = null;
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<courseCount; i++){
            sb.append(courses[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* toString returns a string representation of the list
    // code is missing here
    // remove removes a given course from the list.
    // If the course is not in the list, the list is not updated.
    // code is missing here

    When this code fragment is executed, the following printout is generated:
    <10, Algebra>
    <20, Algorithms>
    <30, Electronics>
    <40, Physics>
    <50, Programming>


    <10, Algebra>
    <20, Algorithms>
    <50, Programming>
        a) Implement the method toString .
        b) Implement the method remove .
        c) What does the object referred to by reference list ,
        look like when the code fragment has been executed? Draw the object.
    */

    public static void main(String[] args) {
        CourseList list = new CourseList();
        list.add(new Course(10, "Algebra"));
        list.add(new Course(20, "Algorithms"));
        list.add(new Course(30, "Electronics"));
        list.add(new Course(40, "Physics"));
        list.add(new Course(50, "Programming"));
        System.out.println(list);
        list.remove(new Course(40, "Physics"));
        list.remove(new Course(30, "Electronics"));
        System.out.println(list);

    }
}