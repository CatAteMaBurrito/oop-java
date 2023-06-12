package Entities;

import java.util.Vector;

public class AcademicOfficer extends Person {
    // Unique reference for Academic Officer
    private String email;
    // handles requests made by students
    private RequestHandeling requestsHandeling = new RequestHandeling(this.email);

    public void viewNewRequests() {
        requestsHandeling.showRequests();
    }

    public void addNewRequest(Request request) {
        requestsHandeling.addRequest(request);
    }

    public AcademicOfficer(String name, String email) {
        super(name);
        this.email = email;
    }

    // Browse Students
    public void browseStudents(Vector<Student> studentslist) {
        System.out.printf("%-35s", "Name");
        System.out.printf("%-9s", "MatricNO");
        System.out.println();
        for (Student x : studentslist) {
            System.out.printf("%-35s", x.getName());
            System.out.printf("%-9s", x.getMatricNo());
            System.out.println();
        }
    }

    // Browse Courses
    public void listallCourses(Vector<Course> courseslist) {
        if (courseslist.size() == 0) {
            System.out.println("No courses exist !!!");
        } else {
            System.out.printf("%-10s", "Code");
            System.out.printf("%-10s", "Section");
            System.out.printf("%-20s", "Faculty");
            System.out.println();
            for (Course x : courseslist) {
                System.out.printf("%-10s", x.getCode());
                System.out.printf("%-10s", x.getSection());
                System.out.printf("%-20s", x.getFaculty());
                System.out.println();
            }
        }

    }

    // Browse Lecturer
    public void listallLecturers(Vector<Lecturer> lecturerslist) {
        System.out.printf("%-35s", "Name");
        System.out.printf("%-9s", "staffID");
        System.out.println();
        for (Lecturer x : lecturerslist) {
            System.out.printf("%-35s", x.getName());
            System.out.printf("%-9s", x.getStaffid());
            System.out.println();
        }
    }

    // Drop Student From Course
    public void dropStudent(Course course, Student student) {
        if (course.removeStudent(student)) {

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

}
