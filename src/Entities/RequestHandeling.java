package Entities;

import java.util.Vector;

public class RequestHandeling {

    private String emailref;

    public RequestHandeling(String emailref) {
        this.emailref = emailref;
    }

    public String getEmailref() {
        return emailref;
    }

    public Vector<Request> getRequests() {
        return requests;
    }

    private Vector<Request> requests = new Vector<Request>(0);

    public void showRequests() {
        if (requests.size() != 0) {
            for (Request x : requests) {
                System.out.printf("[%s] From [%s] For [%s] \n", x.getCourseCode(), x.getID_refrence(), x.getType());
            }
        }
    }

    public void addRequest(Request request) {
        requests.add(request);
    }
}
