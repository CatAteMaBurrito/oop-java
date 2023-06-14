package Model;
import java.util.Vector;;

public class Student extends Person{
    private String matricNo;
    private Vector<Request> requesthistory = new Vector<Request>(0);
    private Vector<Course> registeredCourses = new Vector<Course>(0);

    public Student(String name, Faculty faculty, String matricNo) {
        super(name, faculty);
        this.matricNo = matricNo;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public Request requestSectionChange(Course oldCourse, Course newCourse){
        return new Request(matricNo, oldCourse.getCode(), oldCourse.getSection(), newCourse.getSection(), 1);
    }

    public Request requestCourseDrop(Course course){
        return new Request(matricNo, course.getCode(), course.getSection(),0);
    }

    public void getRequesthistory() {
        System.out.printf(" %-10s %-4s %-4s \n", "Code", "sec", "sec", "type");
        for(Request x: requesthistory){
            if(x.getTypeIndex() == 0){
                System.out.printf(" %-10s %-4s %-4s %-15s \n", x.getCourseCode(), x.getSection1(), "", "DROP COURSE" );
            }else{
                System.out.printf(" %-10s %-4s %-4s %-15s \n", x.getCourseCode(), x.getSection1(), x.getSection2(), "CHANGE SECTION");
            }
            
        }
    }

    public void setRequesthistory(Request request) {
        requesthistory.add(request);
    }

    
}
