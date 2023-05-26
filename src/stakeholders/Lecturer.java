package stakeholders;
public class Lecturer extends Person {
    private String staffNumber;
    private String Deparment;
    private String Faculty;
    private Course[] courses = new Course[2];
    public Lecturer(String name, int yob, String iD, String nationality, boolean gender, String faculty,
            String staffNumber, String deparment, String faculty2, Course[] courses) {
        super(name, yob, iD, nationality, gender, faculty);
        this.staffNumber = staffNumber;
        Deparment = deparment;
        Faculty = faculty2;
        this.courses = courses;
    }
    
    // create browse & choose subjects to teach

}
