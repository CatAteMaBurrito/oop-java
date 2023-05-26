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

    public Course(String courseName, String courseCode, int section, String faculty, int creditHours) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.section = section;
        this.faculty = faculty;
        this.creditHours = creditHours;
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

    public Student getStudentIndex(int index){
        return listofStudents[index];
    }

    public int getMAX_STUDENT() {
        return MAX_STUDENT;
    }

}
