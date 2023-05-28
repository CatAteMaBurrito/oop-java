package stakeholders;
public class Student extends Person {
    private String matricNum;

    // if greater than or equal to 18
    // Get permission from dean

    private final int MAX_CREDITS = 18;

    private int totalcredithours;

    private double cgpa;

    private String description = "Undergraduate Student";

    public Student(String name, int yob, String ID, String nationality, boolean gender, String faculty,
            String matricNum, int totalcredithours, double cgpa) {
        super(name, yob, ID, nationality, gender, faculty);
        this.matricNum = matricNum;
        this.totalcredithours = totalcredithours;
        this.cgpa = cgpa;
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

    public void setMatricNum(String matricNum) {
        this.matricNum = matricNum;
    }

    public void setTotalcredithours(int totalcredithours) {
        this.totalcredithours = totalcredithours;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // fill-in / edit profile/info
        // 1. can mondify the description
        // 2. can view the description
        // 3. can view the profile info

    // browse and register courses
        // 1. register courses - listofcourses from AcademicOfficer
        // 2. view registered course 

    // course section amendment
        // 1. change section - change course?
    
    
}
