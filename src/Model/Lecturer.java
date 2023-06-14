<<<<<<< HEAD:src/Model/Lecturer.java
package Model;
=======
package Entities;
import controllers.Course_controller;
>>>>>>> 5da6cb031a76b633384c57d3bd9e8b55aaf93331:src/Entities/Lecturer.java

import java.util.ArrayList;

public class Lecturer extends Person {
    private String staffid;

<<<<<<< HEAD:src/Model/Lecturer.java
    public Lecturer(String name, Faculty faculty, String staffid) {
        super(name, faculty);
=======
    private ArrayList<Course> assignedCourses = new ArrayList<Course>();

    public Lecturer(String name, String staffid) {
        super(name);
>>>>>>> 5da6cb031a76b633384c57d3bd9e8b55aaf93331:src/Entities/Lecturer.java
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public void enrollCourse(Course course) {
        System.out.println("Adding course : ");
        course.printCourseInfo();
        assignedCourses.add(course);
    }

    public void deleteCourse(int index) {
        System.out.println("Deleting course : ");
        assignedCourses.get(index).printCourseInfo();
        assignedCourses.remove(index);
    }

    public void displayAssignedCourses() {
        if (assignedCourses.isEmpty()) {
            System.out.println("You have not enrolled in any course.");
        } else {
            System.out.println("Assigned Courses for " + super.getName() + " (" + getStaffid() + ")");
            int i = 1;
            for (Course tempCourse : assignedCourses) {
                System.out.print("(" + i + ") ");
                tempCourse.printCourseInfo();
                i++;
            }
        }
    }

    public void viewAssignedStudents() {
        for (Course tempCourse : assignedCourses) {
            tempCourse.listAllStudents();
        }
    }

}
