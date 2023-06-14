package Model;

public abstract class Person {
    protected String name;
    protected Faculty faculty;

    public Person(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }
    
    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }
    
}
