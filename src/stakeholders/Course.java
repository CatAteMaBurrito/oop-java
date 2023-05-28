package stakeholders;

// The association to the class Lecturer is done with Key: Section + Course Code
// Only Academic Officer can create and edit Courses
// Best to declare array of courses
public class Course {
    private String courseName;
    private String courseCode;
    private int section;
    private String faculty;
    private final int MAX_STUDENT = 35;
    private int creditHours;
    private Lecturer lecturer;
    private Student[] listofStudents = new Student[MAX_STUDENT];

    public Course(){
        this.courseName = null;
        this.courseCode = null;
        this.section = 0;
        this.faculty = null;
        this.creditHours = 0;
    }

    public Course(String courseName, String courseCode, int section, String faculty, int creditHours) {
        // if credit hour is less than fucking 0 , set it to 1
        // if credit hour is more than fucking 8 , set it to 8
        // section can be a positive integer no greater than 100
        // ur moms gay
        this.courseName = courseName;
        this.courseCode = courseCode;
        if(section > 100){
            this.section = 100;
        }else{
            this.section = section;
        }
        this.faculty = faculty;
        if(creditHours < 0){
            this.creditHours = 1;
        }else if(creditHours > 8){
            this.creditHours = 8;
        }else{
            this.creditHours = creditHours;
        }
        
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void setListofStudents(Student[] listofStudents) {
        this.listofStudents = listofStudents;
    }

    // set specific student information
    public void setStudentAtIndex(Student student, int index){
        listofStudents[index] = student;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getSection() {
        return section;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public Student[] getListofStudents() {
        return listofStudents;
    }

    // Get Index of student 
    public Student getStudentIndex(int index){
        return listofStudents[index];
    }

    public int getMAX_STUDENT() {
        return MAX_STUDENT;
    }

}
