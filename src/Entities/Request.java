package Entities;

public class Request {
    private String ID_refrence;
    private String courseCode; // course
    private int section1; // old section
    private int section2; // new section
    private int type = 0; // 0 = Drop Course 1 = Change Section

    // request a course drop constructor
    public Request(String iD_refrence, String courseCode, int section1, int type) {
        ID_refrence = iD_refrence;
        this.courseCode = courseCode;
        this.section1 = section1;
        this.type = type;
    }

    // request a section change constructor
    public Request(String iD_refrence, String courseCode, int section1, int section2, int type) {
        ID_refrence = iD_refrence;
        this.courseCode = courseCode;
        this.section1 = section1;
        this.section2 = section2;
        this.type = type;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getSection1() {
        return section1;
    }

    public int getSection2() {
        return section2;
    }

    public String getType() {
        if (type == 1) {
            return "Changing Section";
        } else {
            return "Droping Course";
        }
    }

    public int getTypeIndex() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getID_refrence() {
        return ID_refrence;
    }

}
