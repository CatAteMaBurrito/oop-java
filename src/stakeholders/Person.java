package stakeholders;
public class Person {
    protected String name;
    protected int yob;
    protected String ID;
    protected String nationality;
    protected boolean gender; // True: Male, False: Female
    
    public Person(String name, int yob, String iD, String nationality, boolean gender) {
        this.name = name;
        this.yob = yob;
        ID = iD;
        this.nationality = nationality;
        this.gender = gender;
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


}
