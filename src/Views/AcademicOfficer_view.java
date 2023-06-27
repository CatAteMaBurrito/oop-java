package Views;

import java.util.Vector;

import Model.Course;
import Model.Lecturer;
import Model.Student;

public class AcademicOfficer_view {

    // Browse Courses
    public void PrintAllCourses(Vector<Course> courseslist) {
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
    public void PrintAllLecturers(Vector<Lecturer> lecturerslist) {
        System.out.printf("%-35s", "Name");
        System.out.printf("%-9s", "staffID");
        System.out.println();
        for (Lecturer x : lecturerslist) {
            System.out.printf("%-35s", x.getName().substring(0, 34));
            System.out.printf("%-9s", x.getStaffid());
            System.out.println();
        }
    }

    // Browse Students
    public void PrintAllStudents(Vector<Student> studentslist) {
        System.out.printf("%-35s", "Name");
        System.out.printf("%-9s", "MatricNO");
        System.out.println();
        for (Student x : studentslist) {
            System.out.printf("%-35s", x.getName().substring(0, 34));
            System.out.printf("%-9s", x.getMatricNo());
            System.out.println();
        }
    }

}
