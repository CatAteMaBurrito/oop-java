package Controllers;

import Model.Lecturer;
import Views.Lecturer_view;
import Model.Course;

public class Lecturer_controller {
    Lecturer model;
    Lecturer_view view;

    public Lecturer_controller(Lecturer model) {
        this.model = model;
    }

    public void enrollCourse(Course course) {
        System.out.println("Adding course : ");
        // course.printCourseInfo();
        model.getAssignedCourses().add(course);
    }

    public void deleteCourse(int index) {
        System.out.println("Deleting course : ");
        // model.getAssignedCourses().get(index).printCourseInfo();
        model.getAssignedCourses().remove(index);
    }

    public void printstuents(){
        view.viewAssignedStudents(model.getAssignedCourses());
    }

    public void printCourses(){
        view.displayAssignedCourses(model.getAssignedCourses(), model);
    }

}