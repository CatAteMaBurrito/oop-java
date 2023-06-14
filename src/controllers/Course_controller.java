package controllers;

import java.util.Vector;

import Entities.Course;
import Entities.Student;
import Entities.Lecturer;


public class Course_controller extends Course {

    private Vector<Student> listofStudents;

    public Course_controller(String name, String code, int section, String faculty, int credithours, Vector<Student> listofAllStudents){
        super(name, code, section, faculty, credithours);
        this.listofStudents = listofAllStudents;
    }

    public void setListofStudents(Vector<Student> listofStudents) {
        this.listofStudents = listofStudents;
    }

    public boolean removeStudent(Student student) {
        if (listofStudents.size() == 0) {
            return false;
        } else {
            listofStudents.removeElement(student);
            return true;
        }
    }

    public void listAllStudents() {
        System.out.println("List of assigned students for the course : ");
        printCourseInfo();
        System.out.println("\nStudent List");
        int i = 0;
        if (listofStudents.isEmpty()) {
            System.out.println("No students have enrolled for the course yet.");
        } else {
            for (Student tempStudent : listofStudents) {
                System.out.println("(" + i + ") " + tempStudent.getName() + " (" + tempStudent.getMatricNo() + ")");
                i++;
            }
        }
    }

    public boolean addStudent(Student student, boolean forced_Insertion) {
        if (listofStudents.size() < 35 || forced_Insertion == true) {
            listofStudents.add(student);
            return true;
        } else {
            return false;
        }
    }

    public boolean checkStudent(Student student) {
        for (Student s : listofStudents) {
            if (s == student) {
                return true;
            }
        }
        return false;
    }

    private Lecturer lecturer;

    public boolean removelecturer() {
        if (lecturer == null) {
            return false;
        } else {
            lecturer = null;
            return true;
        }
    }

    public boolean addLecturer(Lecturer lecturer) {
        if (this.lecturer != null) {
            return false;
        } else {
            this.lecturer = lecturer;
            return true;
        }
    }

    public void printCourseInfo() {
        System.out.printf(" %-10s %-4s \n", code, section);
    }

}
