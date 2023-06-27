package Controllers;

import Model.Student;
import Model.Course;
import Model.Request;

public class Student_controller {
    private Student model;

    public Student_controller(Student model) {
        this.model = model;
    }

    public Student getModel() {
        return this.model;
    }

    public void registeredCourse(Course course) {
        if (course.addStudent(this.model, false)) {
            model.getRegisteredCourses().add(course);
        } else {
            // error
        }
    }

    // this is during registration (incase you want to remove registered course).
    public void dropCourse(Course course) {
        if (course.removeStudent(this.model)) {
            model.getRegisteredCourses().remove(course);
        } else {
            // error
        }
    }

    public Request requestSectionChange(Course oldCourse, Course newCourse) {
        return new Request(this.model, oldCourse, newCourse);
    }

    // this is requesting the academic officer to drop a course during ammendment.
    public Request requestCourseDrop(Course course) {
        return new Request(this.model, course);
    }

}
