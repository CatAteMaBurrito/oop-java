package Interface;

import java.util.*;

import Controllers.AcademicOfficer_controller;
import Model.*;
import Views.AcademicOfficer_view;

public class Interface {
    public static Vector<Course> allCourses = new Vector<Course>(0);
    public static Vector<AcademicOfficer> allAO = new Vector<AcademicOfficer>(0);
    public static Vector<Student> allStu = new Vector<Student>(0);
    public static Vector<Lecturer> allProfs = new Vector<Lecturer>(0);



    
    public static void menu() {
        System.out.println("----------------------");
        System.out.println(" [1] Academic Officer ");
        System.out.println(" [2] Lecturer ");
        System.out.println(" [3] Student ");
        System.out.println(" [0] Exit");
        System.out.println("----------------------");

    }

    // AO Section
    // -------------------------------------------------------------------------------------------
    /*
     * The functions AcademicOfficer Should do
     * 1. View All the Courers
     * 2. View All the Students
     * 3. View All the Lecturer
     * 4. Set the the time for admendment
     * ( if time for admentment then students can change section if avaiable space
     * and if not request section change)
     * ( else can request course drop)
     * 5. Set the registration time
     * (if true then students can register and drop subject)
     * 6. Set the lecturers for each subject
     * 7. Make a new course and assign a lecturer to it
     * 8. Change the lecturers section
     * 9. Delete a Course
     * 10. View all Requests
     * 11. Change Student Section
     * 12. Drop Student from Course
     */

    public static boolean AOIF(AcademicOfficer AOF, Scanner input) {
        AcademicOfficer_controller officer = new AcademicOfficer_controller(AOF, new AcademicOfficer_view());
        System.out.println("-----------------------");
        System.out.println("[1] View All Courses");
        System.out.println("[2] View All Students");
        System.out.println("[3] View All Lecturers");
        System.out.println("[4] View New Requests");
        System.out.println("[5] Search Course");
        System.out.println("[0] Exit");
        System.out.println("-----------------------");
        switch (Integer.parseInt(input.nextLine())) {
            case 1:
                officer.view.PrintAllCourses(allCourses);
                break;
            case 2:

                officer.view.PrintAllStudents(allStu);;
                break;
            case 3:
                officer.view.PrintAllLecturers(allProfs);;
                break;
            case 4:
                officer.viewNewRequests();
                break;
            case 5:
                String code = input.nextLine();
                officer.findCourse(code, allCourses);
                break;
            default:
                System.out.println("Exiting . . . press any button to continue");
                input.nextLine();
                return false;
        }

        return true;
    }

    // Student Sections
    // ---------------------------------------------------------------------------------------------

    public static boolean StuIF(Student student, Scanner input) {
        System.out.println("--------------------------");
        System.out.println("[1] Make a New Request");
        System.out.println("[2] View Registered Courses");
        System.out.println("[3] View Request History");
        System.out.println("[0] Exit");
        System.out.println("--------------------------");
        switch (input.nextInt()) {
            case 1:
                Request newrequest = student.requestCourseDrop(allCourses.get(0));
                allAO.get(0).addNewRequest(newrequest);
                student.setRequesthistory(newrequest);
                break;
            case 2:
                System.out.printf(" %-10s %-4s \n", "CODE", "SECTION");
                for (Course x : allCourses) {
                    if (x.checkStudent(student)) {
                        x.printCourseInfo();
                    }
                }
                break;
            case 3:
                student.getRequesthistory();
                break;
            default:
                System.out.println("Exiting . . . press any button to continue");
                input.nextLine();
                return false;
        }
        return true;
    }

    public static boolean Lecturer(Lecturer lecturer, Scanner input) {
        System.out.println("-----------------------");
        System.out.println("[1] View Assigned Courses");
        System.out.println("[2] Add New Course");
        System.out.println("[3] Delete a Course");
        System.out.println("[4] View Assigned Students");
        System.out.println("[0] Exit");
        System.out.println("-----------------------");
        
        switch (Integer.parseInt(input.nextLine())) {
            case 1:
                lecturer.displayAssignedCourses();
                break;
            case 2:
                int i = 1;
                for (Course tempCourse : allCourses) {
                    System.out.print("(" + i + ") ");
                    tempCourse.printCourseInfo();
                    i++;
                }
                System.out.print("\nPlease enter the index of the course you would like to enroll for => ");
                int enrollSelection = Integer.parseInt(input.nextLine()) - 1;
                lecturer.enrollCourse(allCourses.get(enrollSelection));
                break;
            case 3:
                System.out.print("\nPlease enter the index of the course you would like to unenroll => ");
                lecturer.displayAssignedCourses();
                int lecturerSelection = Integer.parseInt(input.nextLine()) - 1;
                lecturer.deleteCourse(lecturerSelection);
                break;
            case 4:
                lecturer.viewAssignedStudents();
                break;
            default:
                System.out.println("Exiting . . . press any button to continue");
                input.nextLine();
                return false;
        }

        return true;
    }

}
