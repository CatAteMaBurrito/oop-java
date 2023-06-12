package Entities;

public abstract class Person {
    protected String name;
    // protected String faculty;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
