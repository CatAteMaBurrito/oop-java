package Controllers;

import Model.Student;
import Model.Course;
import Model.Request;

interface Registrable {
    void registerCourse(Course course);

    void dropCourse(Course course);
}

public class Student_controller implements Registrable {
    private Student model;

    public Student_controller(Student model) {
        this.model = model;
    }

    public Student getModel() {
        return this.model;
    }

    @Override
    public void registerCourse(Course course) {
        if (course.addStudent(this.model, false)) {
            model.getRegisteredCourses().add(course);
        } else {
            // error
        }
    }

    @Override
    public void dropCourse(Course course) {
        if (course.removeStudent(this.model)) {
            model.getRegisteredCourses().remove(course);
        } else {
            // error
        }
    }

    public Request requestSectionChange(Course oldCourse, Course newCourse) {
        Request newrequest = new Request(this.model, oldCourse, newCourse);
        model.setRequesthistory(newrequest);
        return newrequest;
    }

    public Request requestCourseDrop(Course course) {
        Request newrequest = new Request(this.model, course);
        model.setRequesthistory(newrequest);
        return newrequest;
    }
}
