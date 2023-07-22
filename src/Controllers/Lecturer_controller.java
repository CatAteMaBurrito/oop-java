package Controllers;

import Model.Lecturer;
import Views.Lecturer_view;
import Model.Course;

public class Lecturer_controller {
    Lecturer model;
    Lecturer_view view;

    public Lecturer_controller(Lecturer model, Lecturer_view view) {
        this.model = model;
        this.view = view;
    }

    public void enrollCourse(Course course) {
        if (model.assignedCourses.contains(course)) {
            view.displayAlreadyEnrolled();
            return;
        } else {
            view.displayEnrollMessage();
            course.printCourseInfo();
            model.assignedCourses.add(course);
        }
    }

    public void deleteCourse(int index) {
        view.displayUnenrollMessage();
        model.assignedCourses.get(index).printCourseInfo();
        model.assignedCourses.remove(index);
    }

    public void getAssignedCourses() {
        view.displayAssignedCourses(model.assignedCourses, model.getName(), model.getStaffid());
    }

    public void getAssignedStudents() {
        view.viewAssignedStudents(model.assignedCourses);
    }
}