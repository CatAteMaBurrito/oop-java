package stakeholders;
import java.util.Scanner;
import java.util.Vector;

public class AcademicOfficer extends Person {
    private String email; // Unique Identifier 
    private Vector<Course> listofallCourses = new Vector<Course>(4);
    private Vector<Student> listofallStudents = new Vector<Student>(30);
    

    public AcademicOfficer(String name, int yob, String iD, String nationality, boolean gender, String faculty,String email) {
        super(name, yob, iD, nationality, gender, faculty);
        this.email = email;
    }

    // create a new course
    public Course createNewCourse(String courseName, String courseCode, int section, String faculty, int creditHours){
        Course newcourse = new Course(courseName, courseCode, section, faculty, creditHours);
        return newcourse;
    }
    // Browser List of all students 
    public void browseStudents(Vector<Student> studentslist){
        for(Student x: studentslist){
            System.out.println(
                "Name :" + x.getName() + "\n" +
                "Matric No :" + x.getMatricNum() + "\n"
            );
        }
    }

    // show list of all course under academic officer
    public void listallCourses(){
        for(Course x: listofallCourses){
            System.out.println(
                "Course Name :" + x.getCourseName() + "\n" +
                "Course Code :" + x.getCourseCode() + "\n" +
                "Section :" + x.getSection() + "\n" +
                "Faculty :" + x.getFaculty() + "\n" );
        }
    }
    // browse and view student list & subject list
    // edit existing course
    // Change course section
    public void editCourseSection(Course course){
        Scanner input = new Scanner(System.in);
        course.setSection(input.nextInt());
        input.close();
    }

    public void changeLecturer(Lecturer lecturer,Course course){
        Scanner input = new Scanner(System.in);
        course.setLecturer(lecturer);
        input.close();
    }

    public void changeStudent(Student student,Course course){
        for(int i = 0; i < course.getMAX_STUDENT(); i++){
            if(student == course.getStudentIndex(i)){
                course.setStudentAtIndex(student, i);
            }
        }
    }
    // Manage student conflicts 
    // Manage lecturer conflicts
    

}
