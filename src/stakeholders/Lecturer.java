package stakeholders;
public class Lecturer extends Person {
    private String staffNumber;
    private String Deparment;
    private String Faculty;
    private Course[] courses = new Course[2];

    public Lecturer(String name, int yob, String iD, String nationality, boolean gender, String staffNumber,
            String deparment, String faculty, Course[] courses) {
        super(name, yob, iD, nationality, gender);
        this.staffNumber = staffNumber;
        Deparment = deparment;
        Faculty = faculty;
        this.courses = courses;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public String getDeparment() {
        return Deparment;
    }

    public String getFaculty() {
        return Faculty;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public void setDeparment(String deparment) {
        Deparment = deparment;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }


    // create browse & choose subjects to teach

}
