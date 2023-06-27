package Model;

import java.util.ArrayList;

public class AcademicOfficer extends Person {
    // Unique reference for Academic Officer
    private String email;
    // handles requests made by students
    static ArrayList<Request> listofRequests = new ArrayList<Request>(0);

    public AcademicOfficer(String name, Faculty faculty, String email) {
        super(name, faculty);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Request> getListofRequests() {
        return listofRequests;
    }

}
