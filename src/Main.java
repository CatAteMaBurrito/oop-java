import java.util.Scanner;

import handlers.MainHandler;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MainHandler.Declare_All_Variables();
        int choice = 0;
        do {

            MainHandler.menu();
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                while (MainHandler.AOIF(MainHandler.allAO.get(0), input))
                    ;
            } else if (choice == 2) {
                while (MainHandler.LecturerIF(MainHandler.allProfs.get(0), input))
                    ;
            } else if (choice == 3) {
                while (MainHandler.StuIF(MainHandler.allStu.get(0), input))
                    ;
            } else {
                System.out.println("Exiting . . .");
            }
        } while (choice != 0);

        input.close();
    }

}
