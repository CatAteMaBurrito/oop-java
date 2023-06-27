package Model;
import java.util.Vector;

public class Student extends Person {
    private String matricNo;
    private Vector<Request> requesthistory = new Vector<Request>(0);
    private Vector<Course> registeredCourses = new Vector<Course>(0);

    public Student(String name, Faculty faculty, String matricNo) {
        super(name, faculty);
        this.matricNo = matricNo;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public void registeredCourse(Course course){
        if(course.addStudent(this, false)){
            registeredCourses.add(course);
        }else{
            // error
        }
    }

    public void dropCourse(Course course){
        if(course.removeStudent(this)){
            registeredCourses.remove(course);
        }else{
            // error
        }
    }

    public Request requestSectionChange(Course oldCourse, Course newCourse) {
        return new Request(this, oldCourse, newCourse );
    }

    public Request requestCourseDrop(Course course) {
        return new Request(this, course);
    }

    public void getRequesthistory() {
        System.out.printf(" %-10s %-4s %-4s \n", "Code", "sec", "sec", "type");
        for (Request x : requesthistory) {
            if (x.getType() == 0) {
                System.out.printf(" %-10s %-4s %-4s %-15s \n", x.getCourse1(), x.getCourse1().getSection(), "", "DROP COURSE");
            } else {
                System.out.printf(" %-10s %-4s %-4s %-15s \n", x.getCourse1(), x.getCourse1().getSection(), x.getCourse2().getSection(),
                        "CHANGE SECTION");
            }

        }
    }

    public void setRequesthistory(Request request) {
        requesthistory.add(request);
    }

}
