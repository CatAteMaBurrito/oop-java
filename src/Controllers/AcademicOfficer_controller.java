package Controllers;

import Model.AcademicOfficer;
import Model.Course;
import Model.Lecturer;
import Model.Student;
import Views.AcademicOfficer_view;
import Model.Request;

public class AcademicOfficer_controller {
    private AcademicOfficer model;
    public AcademicOfficer_view view;

    public AcademicOfficer_controller(AcademicOfficer model, AcademicOfficer_view view) {
        this.model = model;
        this.view = view;
    }

    public void addNewRequest(Request request) {
        model.getListofRequests().add(request);
    }

    // Drop Student From Course
    public void dropStudent(Course course, Student student) {
        if (course.removeStudent(student)) {
            student.removeCourse(course);
        } else {
            System.out.println(course.getCode() + " Section " + course.getSection() + " is Empty");
        }

    }

    // Change Student Section
    public void changeStudentSection(Course oldCourse, Course newCourse, Student student) {
        newCourse.addStudent(student, true);
        oldCourse.removeStudent(student);
    }

    // Drop Lecturer From Course
    public void dropLecturer(Course course) {
        if (course.removelecturer()) {

        } else {
            System.out.println(course.getCode() + " Section " + course.getSection() + " has no lecturer");
        }
    }

    // Change Lecturer From Course
    public void changeLecturerSection(Course oldCourse, Course newCourse, Lecturer lecturer) {
        if (newCourse.addLecturer(lecturer)) {
            oldCourse.removelecturer();
        } else {
            System.out.println(newCourse.getCode() + " Section " + newCourse.getSection() + " Already has a Lecturer");
        }
    }

    // Implement Request Handeling
    // 1. Request Process chech if Student OR Lecturer
    // 2. Excute accordingly to the request choosen

    public void preformRequest(Request request) {
        if (request.getSturef() != null) {
            switch (request.getType()) {
                case 0:
                    dropStudent(request.getCourse1(), request.getSturef());
                    break;
                case 1:
                    changeStudentSection(request.getCourse1(), request.getCourse2(), request.getSturef());
                    break;
            }
        } else if (request.getLecref() != null) {
            switch (request.getType()) {
                case 0:
                    dropLecturer(request.getCourse1());
                    break;
                case 1:
                    changeLecturerSection(request.getCourse1(), request.getCourse2(), request.getLecref());
                    break;
            }
        } else {
            System.out.println("Error: Request has both sturef & lecref as NULL");
        }
    }

    public void choosenRequest(int choice) {
        try {
            preformRequest(model.getListofRequests().get(choice));
            model.getListofRequests().remove(model.getListofRequests().get(choice));
        } catch (Exception e) {
            System.out.println(choice + " is not a valid index ");
        }
    }

    public void displayRequests() {
        view.PrintallRequest(model.getListofRequests());
    }
}

// Fixes for student controller
/*
 * Request newrequest = new Request(this.model, course);
 * model.setRequesthistory(newrequest);
 * return newrequest;
 * 
 */
