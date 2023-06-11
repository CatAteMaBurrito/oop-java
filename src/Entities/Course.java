package Entities;

import java.util.Vector;

public class Course {
    private String name;
    private String code;
    private int section;
    private String faculty;
    private int credithours;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getSection() {
        return section;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCredithours() {
        return credithours;
    }

    private Vector<Student> listofStudents = new Vector<Student>(0);

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

    public Course(String name, String code, int section, String faculty, int credithours) {
        this.name = name;
        this.code = code;
        this.section = section;
        this.faculty = faculty;
        this.credithours = credithours;
    }

    public void printCourseInfo() {
        System.out.printf(" %-10s %-4s \n", code, section);
    }
}
