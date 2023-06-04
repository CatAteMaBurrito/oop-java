package Entities;

public class Lecturer extends Person{
    private String staffid;

    public Lecturer(String name, String staffid) {
        super(name);
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }
    
}
