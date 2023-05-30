package stakeholders;
public abstract class Person {
    protected String name;
    protected int yob;
    protected String ID;
    protected String nationality;
    protected boolean gender; // True: Male, False: Female
    protected String faculty;

    public Person(String name, int yob, String iD, String nationality, boolean gender, String faculty) {
        this.name = name;
        this.yob = yob;
        ID = iD;
        this.nationality = nationality;
        this.gender = gender;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }

    public String getID() {
        return ID;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public String getGender(){
        if(gender == true){
            return "Male";
        } else {
            return "Female";
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }

    public void setID(String iD) {
        ID = iD;
    }
    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
