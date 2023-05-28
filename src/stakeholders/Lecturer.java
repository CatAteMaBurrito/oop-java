package stakeholders;
public class Lecturer extends Person {
    private String staffNumber;
    private String Deparment;
    private String Faculty;
    // Course limit 
    private Course[] courses = new Course[2];
    public Lecturer(String name, int yob, String iD, String nationality, boolean gender, String faculty,
            String staffNumber, String deparment, String faculty2, Course[] courses) {
        super(name, yob, iD, nationality, gender, faculty);
        this.staffNumber = staffNumber;
        Deparment = deparment;
        Faculty = faculty2;
        this.courses = courses;
    }
    
    // Check Course Information
    public void checkCourseInfo(int index){
        System.out.println(
            "Course : " + courses[index].getCourseName() + "\n" +
            "Course code :" + courses[index].getCourseCode() + "\n"+
            "Course Section: " + courses[index].getSection() + "\n"
        );
    }
    // Check Student Information
    public void checkallStudent(int index){
        for(int i = 0;i < courses[index].getMAX_STUDENT(); i++){
            System.out.println( "["+ i+1 +"]" + courses[index].getStudentIndex(i).getName()+ "\n");
        }
    }
    public void checkallStudentInfo(int index, int stu_index){
        System.out.println(
            "Name : " + courses[index].getStudentIndex(stu_index).getName()+ "\n" +
            "MatricNo : " +  courses[index].getStudentIndex(stu_index).getMatricNum() + "\n" +
            "MatricNo : " +  courses[index].getStudentIndex(stu_index).getGpa() + "\n" 
        );
    }
    // Request Course Change
    // 

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

}
