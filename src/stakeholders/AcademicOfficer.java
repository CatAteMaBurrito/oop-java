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
        this.listofallCourses.add(newcourse);
        return newcourse;
    }
    // Functions for the Academic Officer
    /*
        1. browse and view student list & subject list
        2. edit existing course
            - Change course section
    */
    // Browser List of all students 
    public void browseStudents(Vector<Student> studentslist){
        System.out.printf("%35s", "Name");
        System.out.printf("%9s", "MatricNO");
        for(Student x: studentslist){
            System.out.printf("%35s", x.getName());
            System.out.printf("%9s", x.getMatricNum());
        }
    }
    // show list of all course under academic officer
    public void listallCourses(){
        if(listofallCourses.size() == 0){
            System.out.println("No courses exist !!!");
        }else{
            System.out.printf("%10s", "Code");
            System.out.printf("%10s", "Section");
            System.out.printf("%20s", "Faculty");
            for(Course x: listofallCourses){
                    System.out.printf("%10s", x.getCourseCode());
                    System.out.printf("%10d", x.getSection());
                    System.out.printf("%20s", x.getFaculty());
            }
        }
        
    }
    // change course section
    public void editCourseSection(Course course){
        Scanner input = new Scanner(System.in);
        course.setSection(input.nextInt());
        input.close();
    }

    public boolean dropLecturerFromCourse(Lecturer lecturer,Course course){
        if(course.getLecturer() != null && lecturer.getCourseIndex(course) > 1){
            course.setLecturer(null);
            lecturer.setCourses(null);
            return true;
        }else if( lecturer.getCourseIndex(course) > 1){
            // tell the lecturer this isn't his course
            return false;
        }else{
            // Tell the lecturer this section doesn't have a lecturer
            return false; 
        }
    }

    public void changeStudent(Student student,Course course){
        if(course.getSizeOfStudentList() == course.getMAX_STUDENT()){
            System.out.println("Section Full");
        }else{
            for(int i = 0; i < course.getMAX_STUDENT(); i++){
                if(student == course.getStudentIndex(i)){
                    course.setStudentAtIndex(student, i);
                }
            }
        }

    }
    // get and set Email

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // Manage student admentment
    public void changeStudentSection(Course course1,Course course2,Student student){
        if(course2.addNewStudent(student)){
            course1.delteStudent(student);
        }else{
            System.out.println("Get permission from dean ");
        }
    }
    // Manage lecturer conflicts
    

}
