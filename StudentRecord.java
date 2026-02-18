public class StudentRecord {
    // Three fields to store details
    String studentID;
    String name;
    String course;

    // Constructor to initialize the fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to print the student details
    public void displayInfo() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}