package Views;

import java.util.ArrayList;

import Model.Course;
import Model.Lecturer;

public class Lecturer_view {
    public void displayAssignedCourses(ArrayList<Course> assignedCourses,Lecturer lecturer) {
        if (assignedCourses.isEmpty()) {
            System.out.println("You have not enrolled in any course.");
        } else {
            System.out.println("Assigned Courses for " + lecturer.getName() + " (" + lecturer.getStaffid() + ")");
            System.out.printf("%-10s %-2s %-35s", "CODE", "SECTION", "NAME");
            for (Course tempCourse : assignedCourses) {
                System.out.printf("%-10s %-2s %-25s", tempCourse.getCode(), tempCourse.getSection(), tempCourse.getName());
            }
        }
    }

    public void viewAssignedStudents(ArrayList<Course> assignedCourses) {
        for (Course tempCourse : assignedCourses) {
            System.out.printf("%-10s %-2s %-35s", "CODE", "SECTION", "NAME");
            System.out.printf("%-10s %-2s %-25s", tempCourse.getCode(), tempCourse.getSection(), tempCourse.getName());
            tempCourse.PrintAllStudents();
        }
    }
}
