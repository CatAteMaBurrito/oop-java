package Views;

import java.util.ArrayList;

import Model.Course;

public class Lecturer_view {
    public boolean displayAssignedCourses(ArrayList<Course> assignedCourses, String name, String id) {
        if (assignedCourses.isEmpty()) {
            System.out.println("You have not enrolled in any course.");
        } else {
            System.out.println("Assigned Courses for " + name + " (" + id + ")");
            System.out.printf("%-5s %-10s %-14s %-35s\n", "No.", "CODE", "SECTION", "NAME");
            int i = 0;
            for (Course tempCourse : assignedCourses) {
                System.out.printf("%-5s %-10s %-14s %-25s\n", "(" + (i + 1) + ")", tempCourse.getCode(),
                        tempCourse.getSection(),
                        tempCourse.getName());
                i++;
            }
        }
        return assignedCourses.isEmpty();
    }

    public void viewAssignedStudents(ArrayList<Course> assignedCourses) {
        if (assignedCourses.isEmpty()) {
            System.out.println("You do not have any assigned students as you have not enrolled in any course.");
        } else {
            for (Course tempCourse : assignedCourses) {
                tempCourse.printCourseInfo();
                tempCourse.PrintAllStudents();
            }
        }
    }

    public void displayAlreadyEnrolled() {
        System.out.println("\nYou have already enrolled for this course\n");
    }

    public void displayEnrollMessage() {
        System.out.println("\nAdding course : ");
    }

    public void displayUnenrollMessage() {
        System.out.println("\nDeleting course : ");
    }
}
