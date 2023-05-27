import java.util.Scanner;

import stakeholders.AcademicOfficer;

public class App {

    Scanner input = new Scanner(System.in);
    AcademicOfficer officer1 = new AcademicOfficer("Officer1", 1984, "200111023", "Malaysian", true, "Faculty of Computer Science", "Officer1@utm.my");

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

                break;
            case 3:

                break;

            default:
                System.out.println("enter a valid choice");
        }
        input.close();
    }

    public void AcademicOfficerIF(AcademicOfficer officer){

    }

    public void LecturerIF(){

    }

    public void StudentIF(){

    }


}
