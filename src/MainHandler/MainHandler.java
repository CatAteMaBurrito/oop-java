package MainHandler;

import java.util.*;

import Controllers.AcademicOfficer_controller;
import Controllers.Lecturer_controller;
import Controllers.Student_controller;
import Model.*;
import Views.AcademicOfficer_view;
import Views.Student_view;

public class MainHandler {
    public static Vector<Course> allCourses = new Vector<Course>(0);
    public static Vector<AcademicOfficer> allAO = new Vector<AcademicOfficer>(0);
    public static Vector<Student> allStu = new Vector<Student>(0);
    public static Vector<Lecturer> allProfs = new Vector<Lecturer>(0);
    public static boolean admendment = false;

    public static void Declare_All_Variables() {
        allStu.add(new Student("Muhammad Hafiz", Faculty.ELECTRICAL, "A21EC4060"));
        allStu.add(new Student("Lee Mei Ling", Faculty.CIVIL, "A21EC4061"));
        allStu.add(new Student("Rajesh Kumar", Faculty.MECHANICAL, "A21EC4062"));
        allStu.add(new Student("Nurul Azizah", Faculty.BIOMEDICAL, "A21EC4063"));
        allStu.add(new Student("Lim Wei Jie", Faculty.AGRICULTURAL, "A21EC4064"));
        allStu.add(new Student("Tan Mei Hui", Faculty.CHEMICAL, "A21EC4065"));
        allStu.add(new Student("Shankar Nair", Faculty.PHYSICS, "A21EC4066"));
        allStu.add(new Student("Siti Aishah", Faculty.BIOLOGY, "A21EC4067"));
        allStu.add(new Student("Ahmad Iskandar", Faculty.MATHAMATICS, "A21EC4068"));
        allStu.add(new Student("Wong Li Yin", Faculty.ELECTRICAL, "A21EC4069"));
        allStu.add(new Student("Vijay Singh", Faculty.CIVIL, "A21EC4070"));
        allStu.add(new Student("Noraini Abdullah", Faculty.MECHANICAL, "A21EC4071"));
        allStu.add(new Student("Syed Amirul", Faculty.BIOMEDICAL, "A21EC4072"));
        allStu.add(new Student("Chin Yee Wen", Faculty.AGRICULTURAL, "A21EC4073"));
        allStu.add(new Student("Prakash Patel", Faculty.CHEMICAL, "A21EC4074"));
        allStu.add(new Student("Siti Aminah", Faculty.PHYSICS, "A21EC4075"));
        allStu.add(new Student("Zulkifli Mohd", Faculty.BIOLOGY, "A21EC4076"));
        allStu.add(new Student("Lau Siew Ling", Faculty.MATHAMATICS, "A21EC4077"));
        allStu.add(new Student("Ganesh Pillai", Faculty.ELECTRICAL, "A21EC4078"));
        allStu.add(new Student("Nurul Aisyah", Faculty.CIVIL, "A21EC4079"));
        allStu.add(new Student("Rahim Hamzah", Faculty.MECHANICAL, "A21EC4080"));
        allStu.add(new Student("Chong Mei Ling", Faculty.BIOMEDICAL, "A21EC4081"));
        allStu.add(new Student("Krishna Menon", Faculty.AGRICULTURAL, "A21EC4082"));
        allStu.add(new Student("Pooja Sharma", Faculty.CHEMICAL, "A21EC4083"));
        allStu.add(new Student("Ahmad Faizal", Faculty.PHYSICS, "A21EC4084"));
        allStu.add(new Student("Lim Su Yin", Faculty.BIOLOGY, "A21EC4085"));
        allStu.add(new Student("Ravi Chandran", Faculty.MATHAMATICS, "A21EC4086"));
        allStu.add(new Student("Norazura Ismail", Faculty.ELECTRICAL, "A21EC4087"));
        allStu.add(new Student("Kamarul Azman", Faculty.CIVIL, "A21EC4088"));
        allStu.add(new Student("Wong Li Na", Faculty.MECHANICAL, "A21EC4089"));
        allAO.add(new AcademicOfficer("Mohammad Kiwasa", Faculty.COMPUTING, "MohaKiwas23@admin.utm.my"));
        allAO.add(new AcademicOfficer("Siti Nurul Aini", Faculty.CHEMICAL, "sitinurulaini@admin.utm.my"));
        allAO.add(new AcademicOfficer("Ahmad bin Ismail", Faculty.ELECTRICAL, "ahmadismail@admin.utm.my"));
        allAO.add(new AcademicOfficer("Nurul Huda binti Abdullah", Faculty.CIVIL, "nurulhudaabdullah@admin.utm.my"));
        allAO.add(new AcademicOfficer("Muhammad Zulkarnain", Faculty.MECHANICAL, "mzulkarnain@admin.utm.my"));
        allProfs.add(new Lecturer("Ahmad bin Ismail", Faculty.COMPUTING, "FC001P"));
        allProfs.add(new Lecturer("Siti Nurul Aini", Faculty.CHEMICAL, "FC002N"));
        allProfs.add(new Lecturer("Muhammad Zulkarnain", Faculty.ELECTRICAL, "FC003I"));
        allProfs.add(new Lecturer("Nurul Huda binti Abdullah", Faculty.CIVIL, "FC004P"));
        allProfs.add(new Lecturer("Nurul Izzah binti Mohd", Faculty.COMPUTING, "FC011N"));
        allProfs.add(new Lecturer("Ahmad Zahir", Faculty.CHEMICAL, "FC012I"));
        allProfs.add(new Lecturer("Siti Maisarah", Faculty.ELECTRICAL, "FC013P"));
        allProfs.add(new Lecturer("Abdul Hadi", Faculty.CIVIL, "FC014N"));
        allProfs.add(new Lecturer("Norazlina binti Mohd", Faculty.COMPUTING, "FC015I"));
        allProfs.add(new Lecturer("Bob Williams", Faculty.CHEMICAL, "FC008N"));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 1, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 2, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 3, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 4, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 5, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Object Oriented Programming", "SECJ2154", 6, Faculty.COMPUTING, 4));
        allCourses.add(new Course("Web Programming", "SECV2154", 1, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 2, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 3, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 4, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 5, Faculty.COMPUTING, 3));
        allCourses.add(new Course("Web Programming", "SECV2154", 6, Faculty.COMPUTING, 3));
        allCourses.get(0).addStudent(allStu.get(0), false);
        allCourses.get(0).addStudent(allStu.get(1), false);
        allCourses.get(0).addStudent(allStu.get(2), false);
        allCourses.get(0).addStudent(allStu.get(3), false);
        allCourses.get(0).addStudent(allStu.get(4), false);
        allCourses.get(0).addStudent(allStu.get(5), false);
    }

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
     * 5. Handle Reqeuest
     */

    public static boolean AOIF(AcademicOfficer AOF, Scanner input) {
        AcademicOfficer_controller officer = new AcademicOfficer_controller(AOF, new AcademicOfficer_view());
        System.out.println("-----------------------");
        System.out.println("[1] View All Courses");
        System.out.println("[2] View All Students");
        System.out.println("[3] View All Lecturers");
        System.out.println("[4] Change Admendment Period");
        System.out.println("[5] Handle Requests");
        System.out.println("[0] Exit");
        System.out.println("-----------------------");
        switch (Integer.parseInt(input.nextLine())) {
            case 1:
                officer.view.PrintAllCourses(allCourses);
                break;
            case 2:
                officer.view.PrintAllStudents(allStu);
                break;
            case 3:
                officer.view.PrintAllLecturers(allProfs);
                break;
            case 4:
                System.out.println("[1] Turn ON");
                System.out.println("[2] Turn OFF");
                int choice = Integer.parseInt(input.nextLine());
                if (choice == 1) {
                    admendment = true;
                } else {
                    admendment = false;
                }
                break;
            case 5:
                officer.displayRequests();
                int option1 = Integer.parseInt(input.nextLine());
                officer.choosenRequest(option1);
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
        System.out.println("[4] register course");
        System.out.println("[0] Exit");
        System.out.println("--------------------------");

        Student_controller student_controller = new Student_controller(student);
        Student_view student_view = new Student_view(student);

        switch (input.nextInt()) {
            case 1:
            System.out.println("Select course to drop");
            System.out.printf(" %-10s %-4s \n", "COURSE", "SECTION");

            for(int i =0; i < student.getRegisteredCourses().size(); i++){
                System.out.println("["+(i+1)+"] "+student.getRegisteredCourses().get(i).getName() + " " + student.getRegisteredCourses().get(i).getSection());
            }
            int choice = input.nextInt() - 1;
            Request drop = student_controller.requestCourseDrop(student.getRegisteredCourses().get(choice));
            AcademicOfficer_controller officer = new AcademicOfficer_controller(allAO.get(0),new AcademicOfficer_view());
            officer.addNewRequest(drop);
            System.out.println(student.getRegisteredCourses().get(choice).getName() + " has been requested to be dropped");
            break;

            case 2:
                System.out.printf(" %-10s %-4s \n", "CODE", "SECTION", "COURSE", "FACULTY");
                for (Course x: student.getRegisteredCourses()) {
                    System.out.println(x.getName() + " " + x.getSection());
                }
                break;

            case 3:
                System.out.println("Request History");
                System.out.println("--------------------------");
                for (int i = 0; i < student.getRequestHistory().size(); i++) {
                    student.getRequestHistory().get(i).printRequestInfo();
                }
                // System.out.println(student.getRequestHistory().get(i).printCourseInfo());

                break;
            case 4:
                if (admendment == false) {
                    System.out.println("Select course to register");
                    System.out.printf(" %-10s %-4s \n", "COURSE", "SECTION");


                    for (int i = 0; i < allCourses.size(); i++) {
                        System.out.println("[" + (i+1) + "] " + allCourses.get(i).getName() + " " + allCourses.get(i).getSection());
                    }

                    int toRegister = input.nextInt() - 1;
                    student_controller.registerCourse(allCourses.get(toRegister));
                    System.out.println(allCourses.get(toRegister).getName() + " " + allCourses.get(toRegister).getSection() + " registered successfully");

                } else {

                    System.out.println("Registration week is over");

                }
            default:
                System.out.println("Exiting . . . press any button to continue");
                input.nextLine();
                return false;
        }
        return true;
    }

    public static boolean LecturerIF(Lecturer lecturer, Scanner input) {
        Lecturer_controller lc = new Lecturer_controller(lecturer);

        System.out.println("-----------------------");
        System.out.println("[1] View Assigned Courses");
        System.out.println("[2] Add New Course");
        System.out.println("[3] Delete a Course");
        System.out.println("[4] View Assigned Students");
        System.out.println("[0] Exit");
        System.out.println("-----------------------");
        switch (Integer.parseInt(input.nextLine())) {
            case 1:
                // lc.displayAssignedCourses();
                break;
            case 2:
                int i = 1;
                for (Course tempCourse : allCourses) {
                    System.out.print("(" + i + ") ");
                    // tempCourse.printCourseInfo();
                    i++;
                }
                System.out.print("\nPlease enter the index of the course you would like to enroll for => ");
                int enrollSelection = Integer.parseInt(input.nextLine()) - 1;
                lc.enrollCourse(allCourses.get(enrollSelection));
                break;
            case 3:
                System.out.print("\nPlease enter the index of the course you would like to unenroll => ");
                // lc.displayAssignedCourses();
                int lecturerSelection = Integer.parseInt(input.nextLine()) - 1;
                lc.deleteCourse(lecturerSelection);
                break;
            case 4:
                // lc.viewAssignedStudents();
                break;
            default:
                System.out.println("Exiting . . . press any button to continue");
                input.nextLine();
                return false;
        }

        return true;
    }
}