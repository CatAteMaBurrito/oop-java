import java.util.Scanner;

import Interfaces.LecturerIF;
import Interfaces.StudentIF;
import stakeholders.AcademicOfficer;

public class App {
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
                break;
            case 2:
                LecturerIF lectInterface = new LecturerIF();
                lectInterface.start();
                break;
            case 3:
            StudentIF studentInterface = new StudentIF();
                studentInterface.start();
                break;

            default:
                System.out.println("enter a valid choice");
        }
        input.close();
    }
}
