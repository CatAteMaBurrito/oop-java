package Views;

import Model.Student;
import Model.Request;

public class Student_view {

    private Student model;

    public Student_view(Student model) {
        this.model = model;
    }

    public void getprinthistory(Student student) {
        System.out.printf(" %-10s %-4s %-4s \n", "Code", "sec", "sec", "type");
        for (Request x : student.getRequestHistory()) {
            if (x.getType() == 0) {
                System.out.printf(" %-10s %-4s %-4s %-15s \n", x.getCourse1(), x.getCourse1().getSection(), "",
                        "DROP COURSE");
            } else {
                System.out.printf(" %-10s %-4s %-4s %-15s \n", x.getCourse1(), x.getCourse1().getSection(),
                        x.getCourse2().getSection(),
                        "CHANGE SECTION");
            }

        }
    }

    public void printStudentInfo(Student student) {
        System.out.printf("%-35s %-20s %-9s ", student.getName(), student.getFaculty(), student.getMatricNo());
    }
}