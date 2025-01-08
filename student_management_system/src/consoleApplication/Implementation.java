package consoleApplication;

import java.util.*;

public class Implementation {

    List<Student> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void create() throws InterruptedException {
        try {
            System.out.print("Enter RegNo: ");
            int regno = scan.nextInt();
            System.out.print("Enter Name: ");
            String name = scan.next();
            list.add(new Student(regno, name));
            System.out.println("Student created successfully!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct data types.");
            scan.nextLine(); // Clear the invalid input
        }
        Thread.sleep(500);
    }

    public void display() throws InterruptedException {
        if (list.isEmpty()) {
            System.out.println("No students found!");
        } else {
            System.out.println("\nStudent List:");
            for (Student student : list) {
                System.out.println(student);
            }
        }
        Thread.sleep(500);
    }

    public void update() throws InterruptedException {
        try {
            System.out.print("Enter RegNo to update: ");
            int regno = scan.nextInt();
            boolean found = false;

            ListIterator<Student> iterator = list.listIterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.getRegno() == regno) {
                    System.out.print("Enter new name: ");
                    String newName = scan.next();
                    iterator.set(new Student(regno, newName));
                    System.out.println("Student updated successfully!");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student with RegNo " + regno + " not found!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid RegNo.");
            scan.nextLine(); // Clear the invalid input
        }
        Thread.sleep(500);
    }

    public void delete() throws InterruptedException {
        try {
            System.out.print("Enter RegNo to delete: ");
            int regno = scan.nextInt();
            boolean found = false;

            ListIterator<Student> iterator = list.listIterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.getRegno() == regno) {
                    iterator.remove();
                    System.out.println("Student deleted successfully!");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student with RegNo " + regno + " not found!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid RegNo.");
            scan.nextLine(); // Clear the invalid input
        }
        Thread.sleep(500);
    }
}
