package Model;

public class Lecturer extends Person{
    private String staffid;

    public Lecturer(String name, Faculty faculty, String staffid) {
        super(name, faculty);
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }
    
}
