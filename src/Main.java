import java.util.Scanner;

import MainHandler.HandleMain;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HandleMain.Declare_All_Variables();
        int choice = 0;
        do {

            HandleMain.menu();
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                while (HandleMain.AOIF(HandleMain.allAO.get(0), input))
                    ;
            } else if (choice == 2) {
                while (HandleMain.LecturerIF(HandleMain.allProfs.get(0), input))
                    ;
            } else if (choice == 3) {
                while (HandleMain.StuIF(HandleMain.allStu.get(0), input))
                    ;
            } else {
                System.out.println("Exiting . . .");
            }
        } while (choice != 0);

        input.close();
    }

}
