import Interface.Interface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Interface.Declare_All_Variables();
        int choice = 0;
        do {

            Interface.menu();
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {

                while (Interface.AOIF(Interface.allAO.get(0), input));
            } else if (choice == 2) {
                while (Interface.Lecturer(Interface.allProfs.get(0), input));
            } else if (choice == 3) {
                while (Interface.StuIF(Interface.allStu.get(0), input));
            } else {
                System.out.println("Exiting . . .");
            }
        } while (choice != 0);

        input.close();
    }

}
