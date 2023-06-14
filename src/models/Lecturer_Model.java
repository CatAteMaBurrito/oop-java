package models;

import Entities.Course;
import Entities.Person;

import java.util.ArrayList;

public class Lecturer_Model extends Person {
    private String staffid;
    public ArrayList<Course> assignedCourses = new ArrayList<Course>();

    public Lecturer_Model(String name, String staffid) {
        super(name);
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

}
