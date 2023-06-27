package Model;

import java.util.Vector;

public class Student extends Person {
    private String matricNo;
    private Vector<Request> requesthistory = new Vector<Request>(0);
    private Vector<Course> registeredCourses = new Vector<Course>(0); // composition

    public Student(String name, Faculty faculty, String matricNo) {
        super(name, faculty);
        this.matricNo = matricNo;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public Vector<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRequesthistory(Request request) {
        requesthistory.add(request);
    }

    public Vector<Request> getRequestHistory() {
        return this.requesthistory;
    }

    public void removeCourse(Course course) {
        registeredCourses.remove(course);
    }

}
