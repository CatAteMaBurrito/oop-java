package Model;

public class Request {
    private Student sturef; // student reference
    private Lecturer lecref; // lecturer reference
    private Course course1; // old section
    private Course course2; // new section
    private int type = 0; // 0 = Drop Course  1 = Change Section

    
    //Student Constructor for Dropping Course
    public Request(Student sturef, Course course1) {
        this.sturef = sturef;
        this.course1 = course1;
        this.type = 0;
    }
    //Student Constructor for Changing Course Section
    public Request(Student sturef, Course course1, Course course2) {
        this.sturef = sturef;
        this.course1 = course1;
        this.course2 = course2;
        this.type = 1;
    }
    //Lecturer Constructor for Dropping Cour
    public Request(Lecturer lecref, Course course1) {
        this.lecref = lecref;
        this.course1 = course1;
        this.type = 0;
    }
    //Lecturer Constructor for Changing Course Section
    public Request(Lecturer lecref, Course course1, Course course2) {
        this.lecref = lecref;
        this.course1 = course1;
        this.course2 = course2;
        this.type = 1;
    }

    

    public Student getSturef() {
        return sturef;
    }

    public Lecturer getLecref() {
        return lecref;
    }

    public Course getCourse1() {
        return course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public int getType() {
        return type;
    }

    public String getTypeValue() {
        if(type == 1){
            return "Changing Section";
        }else{
            return "Droping Course";
        }
    }

}
