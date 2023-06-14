package controllers;

import models.Lecturer_Model;

import Entities.Course;

public class Lecturer_Controller {
    Lecturer_Model model;

    public Lecturer_Controller(Lecturer_Model model) {
        this.model = model;
    }

    public void enrollCourse(Course course) {
        System.out.println("Adding course : ");
        course.printCourseInfo();
        model.assignedCourses.add(course);
    }

    public void deleteCourse(int index) {
        System.out.println("Deleting course : ");
        model.assignedCourses.get(index).printCourseInfo();
        model.assignedCourses.remove(index);
    }

    public void displayAssignedCourses() {
        if (model.assignedCourses.isEmpty()) {
            System.out.println("You have not enrolled in any course.");
        } else

        {
            System.out.println("Assigned Courses for " + model.getName() + " (" +
                    model.getStaffid() + ")");
            int i = 1;
            for (Course tempCourse : model.assignedCourses) {
                System.out.print("(" + i + ") ");
                tempCourse.printCourseInfo();
                i++;
            }
        }
    }

    public void viewAssignedStudents() {
        for (Course tempCourse : model.assignedCourses) {
            tempCourse.listAllStudents();
        }
    }

}
