import java.util.Scanner;

import stakeholders.AcademicOfficer;
import stakeholders.Course;
import stakeholders.Student;

public class App {

    public static AcademicOfficer officer1 = new AcademicOfficer("Officer1", 1984, "200111023", "Malaysian", true, "Faculty of Computer Science", "Officer1@utm.my");
    public static Course course1 = new Course("Java Programming", "SECJ2033", 1, "Computer", 1);
    public static Course course2 = new Course("Data Structures", "SECD3044", 2, "Computer", 2);
    public static Course course3 = new Course("Database Management", "SECC4055", 3, "Computer", 3);
    public static Course course4 = new Course("Software Engineering", "SECE5066", 4, "Computer", 4);
    public static Course course5 = new Course("Artificial Intelligence", "SECA6077", 5, "Computer", 5);
    public static Student stu6 = new Student("Badshah", 1992, "2021", "Kazakistani", true, "Computer", "A34EC0001", 0, 0, 2.5, 0);
    public static Student stu1 = new Student("Rahul", 1992, "2021", "Indian", true, "Computer Science", "A34EC0001", 0, 0, 2.5, 0);
    public static Student stu2 = new Student("Ayesha", 1995, "2022", "Pakistani", true, "Engineering", "A34EC0002", 0, 0, 3.2, 0);
    public static Student stu3 = new Student("Fatima", 1998, "2023", "Bangladeshi", false, "Psychology", "A34EC0003", 0, 0, 3.8, 0);
    public static Student stu4 = new Student("Mohan", 1994, "2020", "Sri Lankan", true, "Mathematics", "A34EC0004", 0, 0, 3.1, 0);
    public static Student stu5 = new Student("Anushka", 1997, "2021", "Nepalese", false, "Art History", "A34EC0005", 0, 0, 3.6, 0);
    
    public static Student student1 = new Student("Markooz", 2000, "INDIA_69420", "India", true, "Computing", "A21EC1234", 69, 3.2);
    public static Course course1 = new Course();

    public static void main(String[] args) {
        // this is fucking painful
        officer1.addCourse(course1);
        officer1.addCourse(course2);
        officer1.addCourse(course3);
        officer1.addCourse(course4);
        officer1.addCourse(course5);
        course2.addNewStudent(stu1);
        
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
        String pause;
        boolean exit = false;
        do{
            System.out.print("\033[H\033[2J");   
            System.out.flush();
            System.out.println("----------------");
            System.out.println("Academic Officer");
            System.out.println("----------------");
            System.out.println("[1] New Course");
            System.out.println("[2] Browse Courses");
            System.out.println("[3] Delete Student");
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
                    officer.createNewCourse(name,code,section,faculty,creditHours);
                    break;
                case 2:
                    officer.listallCourses();
                    System.out.println("Press any key to continue");
                    input.nextLine();
                    break;
                case 3:
                    course1.printAllStudents();
                    officer.changeStudentSection(course1,course2, stu1);
                    course2.printAllStudents();
                    System.out.println("Press any key to continue");
                    input.nextLine();
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
