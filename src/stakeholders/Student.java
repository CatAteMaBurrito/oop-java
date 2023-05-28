package stakeholders;
public class Student extends Person {
    private String matricNum;

    // if greater than or equal to 18
    // Get permission from dean

    private final int MAX_CREDITS = 18;

    private int totalcredithours;

    private double cgpa;

    private double gpa;

    private String description = "Undergraduate Student";

    public Student(String name, int yob, String iD, String nationality, boolean gender, String faculty,
            String matricNum, int totalcredithours, double cgpa, double gpa) {
        super(name, yob, iD, nationality, gender, faculty);
        this.matricNum = matricNum;
        this.totalcredithours = totalcredithours;
        this.cgpa = cgpa;
        this.gpa = gpa;
    }

    public String getMatricNum() {
        return this.matricNum;
    }
    public int getMax_credit_hours_currentsem() {
        return this.MAX_CREDITS;
    }
    public int getTotalcredithours() {
        return this.totalcredithours;
    }
    public double getCgpa() {
        return this.cgpa;
    }
    public double getGpa() {
        return this.gpa;
    }

    public void setMatricNum(String matricNum) {
        this.matricNum = matricNum;
    }

    public void setTotalcredithours(int totalcredithours) {
        this.totalcredithours = totalcredithours;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // fill-in / edit profile/info
        // 1. can mondify the description
        // 2. 

    // browse and register subjects
        // 1. modify the 

    // check registered subjects
    // course section amendment
    


    // This function is fullfilled by Person
    // browse and register subjects    
    
}
