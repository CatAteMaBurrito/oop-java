package Entities;

public class Student extends Person{
    private String matricNo;

    public Student(String name, String matricNo) {
        super(name);
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

}
