package Interfaces;

import java.util.Scanner;

public class AcademicOfficerIF {
    
    public void start(Scanner input){
        System.out.println("----------------");
        System.out.println("Academic Officer");
        System.out.println("----------------");
        System.out.println("[1] New Subject");
        System.out.println("[2] Edit Subject");
        System.out.println("[0] Exit  ");
        System.out.println("----------------");
        userSelection(input.nextInt());
    }

    private void userSelection(int key){
        switch (key) {
            case 1:
                
                break;
        
            default:
                System.out.println("System is Exiting");
                break;
        }
    }
}
