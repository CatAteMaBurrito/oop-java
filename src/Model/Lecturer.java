package Model;

import java.util.ArrayList;

public class Lecturer extends Person {
    private String staffid;
    public ArrayList<Course> assignedCourses = new ArrayList<Course>();

    public Lecturer(String name, Faculty faculty, String staffid) {
        super(name, faculty);
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

}
