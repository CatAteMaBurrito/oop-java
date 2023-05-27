import java.util.Scanner;

import stakeholders.AcademicOfficer;
import stakeholders.Course;

public class App {

    
    public static AcademicOfficer officer1 = new AcademicOfficer("Officer1", 1984, "200111023", "Malaysian", true, "Faculty of Computer Science", "Officer1@utm.my");
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

                break;

            default:
                System.out.println("enter a valid choice");
        }
        input.close();
    }
    public void userSelection(){
        
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
                    System.out.print("\033[H\033[2J");   
                    System.out.flush();
                    officer.listallCourses();
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

    public void StudentIF(){

    }


}
