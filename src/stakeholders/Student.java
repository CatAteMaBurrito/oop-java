package stakeholders;
public class Student extends Person {
    private String matricNum;
    private int max_credit_hours_currentsem;
    private int totalcredithours;
    private double cgpa;
    private double gpa;
    
    public Student(String name, int yob, String iD, String nationality, boolean gender, String matricNum,
            int max_credit_hours_currentsem, int totalcredithours, double cgpa, double gpa) {
        super(name, yob, iD, nationality, gender);
        this.matricNum = matricNum;
        this.max_credit_hours_currentsem = max_credit_hours_currentsem;
        this.totalcredithours = totalcredithours;
        this.cgpa = cgpa;
        this.gpa = gpa;
    }
    
    // fill-in profile/info
    // browse and register subjects    

}
