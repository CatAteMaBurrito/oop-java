package stakeholders;
public class Student extends Person {
    private String matricNum;
    private int max_credit_hours_currentsem;
    private int totalcredithours;
    private double cgpa;
    private double gpa;
    public Student(String name, int yob, String iD, String nationality, boolean gender, String faculty,
            String matricNum, int max_credit_hours_currentsem, int totalcredithours, double cgpa, double gpa) {
        super(name, yob, iD, nationality, gender, faculty);
        this.matricNum = matricNum;
        this.max_credit_hours_currentsem = max_credit_hours_currentsem;
        this.totalcredithours = totalcredithours;
        this.cgpa = cgpa;
        this.gpa = gpa;
    }
    public String getMatricNum() {
        return matricNum;
    }
    public int getMax_credit_hours_currentsem() {
        return max_credit_hours_currentsem;
    }
    public int getTotalcredithours() {
        return totalcredithours;
    }
    public double getCgpa() {
        return cgpa;
    }
    public double getGpa() {
        return gpa;
    }
    
    // fill-in / edit profile/info
    // This function is fullfilled by Person
    // browse and register subjects    
    
}
