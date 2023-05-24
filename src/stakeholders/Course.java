package stakeholders;
public class Course {
    private String courseName;
    private String courseCode;
    private String section;
    private String faculty;
    private final int MAX_STUDENT = 35;
    private int creditHours;
    private Student[] listofStudents = new Student[MAX_STUDENT];


    public Course(String courseName, String courseCode, String section, String faculty, int creditHours) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.section = section;
        this.faculty = faculty;
        this.creditHours = creditHours;
    }


    public Student[] getListofStudents() {
        return listofStudents;
    }


    public void setListofStudents(Student[] listofStudents) {
        this.listofStudents = listofStudents;
    }

    
    
}
