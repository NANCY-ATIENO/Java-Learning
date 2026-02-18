import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // i) Prompt the user for input
        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        // ii) Instantiate StudentRecord object with user data
        StudentRecord myStudent = new StudentRecord(id, name, course);

        // iii) Call the displayInfo method
        myStudent.displayInfo();
        
        input.close();
    }
}