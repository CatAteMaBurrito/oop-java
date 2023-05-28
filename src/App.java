import java.util.Scanner;

import stakeholders.AcademicOfficer;
import stakeholders.Course;
import stakeholders.Student;

public class App {

    public static AcademicOfficer officer1 = new AcademicOfficer("Officer1", 1984, "200111023", "Malaysian", true, "Faculty of Computer Science", "Officer1@utm.my");
    public static Student student1 = new Student("Markooz", 2000, "INDIA_69420", "India", true, "Computing", "A21EC1234", 69, 3.2);
    public static Course course1 = new Course();
    public static void main(String[] args) {
        System.out.println("Log In as:");
        System.out.println("1. Academic Officer");
        System.out.println("2. Lecturer");
        System.out.println("3. Student");  
        Scanner input = new Scanner(System.in);
        int userSelection = input.nextInt();
        System.out.print("\033[H\033[2J");   
        System.out.flush();
        switch (userSelection) {
            case 1:
                // officer menu
                AcademicOfficerIF(officer1);
                break;
            case 2:

                break;
            case 3:
                StudentIF(student1);
                break;

            default:
                System.out.println("enter a valid choice");
        }
        input.close();
    }

    public static void AcademicOfficerIF(AcademicOfficer officer){
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        do{
            System.out.print("\033[H\033[2J");   
            System.out.flush();
            System.out.println("----------------");
            System.out.println("Academic Officer");
            System.out.println("----------------");
            System.out.println("[1] New Course");
            System.out.println("[2] Browse Courses");
            System.out.println("[3] Edit Course");
            System.out.println("[0] Exit  ");
            System.out.println("----------------");
            int key = input.nextInt();
            input.nextLine();
            switch (key) {
                case 1:
                    System.out.print("Course Name :");
                    String name = input.nextLine();
                    System.out.print("Course Code :");
                    String code = input.nextLine();
                    System.out.print("Course Section :");
                    int section = input.nextInt();
                    input.nextLine();
                    System.out.print("Faculty :");
                    String faculty = input.nextLine();
                    System.out.print("Credit Hours :");
                    int creditHours = input.nextInt();
                    input.nextLine();
                    course1 = officer.createNewCourse(name,code,section,faculty,creditHours);
                    break;
                case 2:
                    officer.listallCourses();
                    System.out.println("Press any key to continue");
                    String pause = input.nextLine();
                    break;
                default:
                    exit = true;
                    break;
            }
        }while(exit == false);
        input.close();
    }

    public void LecturerIF(){

    }


    public static void StudentIF(Student stud){
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        System.out.print("\033[H\033[2J");   
        System.out.flush();
        do {
            System.out.println("----------------");
            System.out.println("Student");
            System.out.println("----------------");
            System.out.println("[1] View Personal Info");
            System.out.println("[2] Edit Description");
            System.out.println("[3] register course");
            System.out.println("[4] View registered courses");
            System.out.println("[5] Course Amendment");
            System.out.println("[0] Exit");


            System.out.println("----------------");
            int key = input.nextInt();
            input.nextLine();


            switch (key) {
                case 1:
                    System.out.println("VIEW PERSONAL INFO");
                    System.out.println("----------------");
                    System.out.println("Student Name: "+stud.getName());
                    System.out.println("Student year of birth: "+stud.getYob());
                    System.out.println("Student ID: "+stud.getID());
                    System.out.println("Student Nationality: "+stud.getNationality());
                    System.out.println("Student Gender: "+stud.getGender());
                    System.out.println("Student Faculty: "+stud.getFaculty());
                    System.out.println("Student Total credit hours: " + stud.getTotalcredithours() );
                    System.out.println("Student CGPA: " + stud.getCgpa() );
                    System.out.println("Student Matric Number: " + stud.getMatricNum());
                    
                    System.out.println("----------------");
                    System.out.println("press [0] to go back");
                    key = input.nextInt();
                    break;

                case 2:
                    System.out.println("EDIT DESCRIPTION");
                    System.out.println("----------------");

                    System.out.println("Current Description: " + stud.getDescription());
                    System.out.println("Enter new Description: ");
                    String newDescription = input.nextLine();
                    stud.setDescription(newDescription);
                    System.out.println(" ");
                    System.out.println("New Description: " + stud.getDescription());

                    System.out.println("----------------");
                    System.out.println("press [0] to go back");
                    key = input.nextInt();
                    break;

                case 3:
                    System.out.println("REGISTER COURSE");
                    key = input.nextInt();

                    break;

                case 4:
                    System.out.println("VIEW REGISTERED COURSES");
                    key = input.nextInt();

                    break;
                
                case 5:
                    System.out.println("COURSE AMENDMENT");
                    key = input.nextInt();

                    break;
                default:
                    exit = true;
                    break;
            }
           
        } while(exit == false);
        input.close();
    }


}
