package Controllers;

import Model.Student;
import Model.Course;
import Model.Request;

interface Registrable {
    void registerCourse(Course course);

    void dropCourse(Course course);
}

class CourseRegistrationException extends RuntimeException {
    public CourseRegistrationException(String message) {
        super(message);
    }
}

class CourseDropException extends RuntimeException {
    public CourseDropException(String message) {
        super(message);
    }
}

public class Student_controller implements Registrable {
    private Student model; // association

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
            throw new CourseRegistrationException(
                    "Failed to register course. Course might be full or other registration constraints.");
        }
    }

    @Override
    public void dropCourse(Course course) {
        if (course.removeStudent(this.model)) {
            model.getRegisteredCourses().remove(course);
        } else {
            throw new CourseDropException("Failed to drop course. The student may not be registered for the course.");
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
