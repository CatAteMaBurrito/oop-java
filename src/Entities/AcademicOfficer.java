package Entities;
import java.util.Vector;
public class AcademicOfficer extends Person {
    private String email;
    private Vector<Course> listofallCourses = new Vector<Course>(4);
    private Vector<Student> listofallStudents = new Vector<Student>(30);
    private Vector<Lecturer> listofallLecturers = new Vector<Lecturer>(20);
    private Vector<Request> requests = new Vector<Request>(1);
    public AcademicOfficer(String name, String email) {
        super(name);
        this.email = email;
    }


    // All the following functions are for testing only 
    //Add All Existing Courses
    public void addCourse(Course course){
        listofallCourses.add(course);
    }
    //Add All Existing Lecturer
    public void addLecturer(Lecturer lecturer){
        listofallLecturers.add(lecturer);
    }
    //Add All Existing Students
    public void addStudent(Student student){
        listofallStudents.add(student);
    }

    // Browse Students
    public void browseStudents(Vector<Student> studentslist){
        System.out.printf("%35s", "Name");
        System.out.printf("%9s", "MatricNO");
        for(Student x: studentslist){
            System.out.printf("%35s", x.getName());
            System.out.printf("%9s", x.getMatricNo());
        }
    }

    // Browse Courses
    public void listallCourses(Vector<Course> courseslist){
        if(courseslist.size() == 0){
            System.out.println("No courses exist !!!");
        }else{
            System.out.printf("%10s", "Code");
            System.out.printf("%10s", "Section");
            System.out.printf("%20s", "Faculty");
            for(Course x: courseslist){
                    System.out.printf("%10s", x.getCode());
                    System.out.printf("%10d", x.getSection());
                    System.out.printf("%20s", x.getFaculty());
            }
        }
        
    }
    
    // Drop Student From Course
    public void dropStudent(Course course, Student student){
        if(course.removeStudent(student)){

        }else{
            System.out.println(course.getCode() + " Section " + course.getSection() + " is Empty");
        }
        
    }
    // Change Student Section
    public void changeStudentSection(Course oldCourse, Course newCourse, Student student){
        newCourse.addStudent(student, true);
        oldCourse.removeStudent(student);
    }
    // Drop Lecturer From Course
    public void dropLecturer(Course course){
        if(course.removelecturer()){

        }else{
            System.out.println(course.getCode() + " Section " + course.getSection() + " has no lecturer");
        }
    }
    // Change Lecturer From Course
    public void changeLecturerSection(Course oldCourse, Course newCourse, Lecturer lecturer){
        if(newCourse.addLecturer(lecturer)){
            oldCourse.removelecturer();
        }else{
            System.out.println(newCourse.getCode() + " Section " + newCourse.getSection() + " Already has a Lecturer");
        }
    }

}
