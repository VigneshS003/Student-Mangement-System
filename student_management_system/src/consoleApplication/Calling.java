package consoleApplication;

import java.util.Scanner;

public class Calling {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM!");
        Thread.sleep(1000); // Pause for better user experience
        Scanner scan = new Scanner(System.in);
        Implementation imp = new Implementation();
        int temp = 1;

        while (temp == 1) {
            System.out.println("\n========= MENU =========");
            System.out.println("Press 1 to Create Student");
            System.out.println("Press 2 to Display Student List");
            System.out.println("Press 3 to Update Student");
            System.out.println("Press 4 to Delete Student");
            System.out.println("Press 5 to Exit");
            System.out.print("Enter your choice : ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    imp.create();
                    break;
                case 2:
                    imp.display();
                    break;
                case 3:
                    imp.update();
                    break;
                case 4:
                    imp.delete();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    Thread.sleep(500);
                    temp = 0;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        System.out.println("Thank you for using the Student Management System!");
        scan.close();
    }
}
