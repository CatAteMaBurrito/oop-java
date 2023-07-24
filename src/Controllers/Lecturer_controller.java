package Controllers;

import Model.Lecturer;
import Views.Lecturer_view;
import Model.Course;
import Exceptions.InvalidCourseException;

interface InterfaceLecturerController {
    void enrollCourse(Course course);

    void deleteCourse(int index) throws InvalidCourseException;

    boolean getAssignedCourses();

    void getAssignedStudents();
}

public class Lecturer_controller implements InterfaceLecturerController {
    Lecturer model;
    Lecturer_view view;

    public Lecturer_controller(Lecturer model, Lecturer_view view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void enrollCourse(Course course) {
        if (model.getAssignedCourses().contains(course)) {
            view.displayAlreadyEnrolled();
            return;
        } else {
            view.displayEnrollMessage();
            course.printCourseInfo();
            model.getAssignedCourses().add(course);
        }
    }

    @Override
    public void deleteCourse(int index) throws InvalidCourseException {
        if (index < 0 || index >= model.getAssignedCourses().size()) {
            throw new InvalidCourseException("Invalid course index provided: " + index);
        } else {
            view.displayUnenrollMessage();
            model.getAssignedCourses().get(index).printCourseInfo();
            model.getAssignedCourses().remove(index);
        }
    }

    @Override
    public boolean getAssignedCourses() {
        boolean lecturerCourseListEmpty = view.displayAssignedCourses(model.getAssignedCourses(), model.getName(),
                model.getStaffid());
        return lecturerCourseListEmpty;
    }

    @Override
    public void getAssignedStudents() {
        view.viewAssignedStudents(model.getAssignedCourses());
    }
}