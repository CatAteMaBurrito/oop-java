package Model;

import java.util.Vector;

public class Course {
    private String name;
    private String code;
    private int section;
    private Faculty faculty;
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

    public Faculty getFaculty() {
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
            // student.getRegisteredCourses().get(student.getRegisteredCourses().indexOf(this)).removeStudent(student);
            return true;
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

    public Course(String name, String code, int section, Faculty faculty, int credithours) {
        this.name = name;
        this.code = code;
        this.section = section;
        this.faculty = faculty;
        this.credithours = credithours;
    }

    public void PrintAllStudents() {
        System.out.println("Student List");
        if (listofStudents.isEmpty()) {
            System.out.println("No students have enrolled for the course yet.\n");
        } else {
            for (Student tempStudent : listofStudents) {
                System.out.printf("%-35s %-20s %-9s\n", tempStudent.getName(), tempStudent.getFaculty(),
                        tempStudent.getMatricNo());
            }
            System.out.print("\n");
        }
    }

    public void printCourseInfo() {
        System.out.printf("%-10s %-2s %-25s\n", code, section, name);
    }
}
