import java.util.Scanner;

public class CSEDepartment {

    // Outer class attributes (department info)
    private String departmentName;
    private String departmentHead;

    // A reference to a Student object created inside the department
    private Student student;

    // Constructor for department
    public CSEDepartment(String departmentName, String departmentHead) {
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("\n--- Department Details ---");
        System.out.println("Department Name : " + departmentName);
        System.out.println("Department Head : " + departmentHead);
    }

    // Inner class representing a student
    public class Student {
        private String name;
        private String id;
        private double cgpa;

        public Student(String name, String id, double cgpa) {
            this.name = name;
            this.id = id;
            this.cgpa = cgpa;
        }

        public void displayStudentInfo() {
            System.out.println("\n--- Student Information ---");
            System.out.println("Name : " + name);
            System.out.println("ID   : " + id);
            System.out.println("CGPA : " + cgpa);
        }
    }

    // Method in outer class to create a student using user input
    public void createStudentFromUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Student CGPA: ");
        double cgpa = sc.nextDouble();

        // Creating inner class object
        this.student = new Student(name, id, cgpa);
    }

    // Method in outer class to display student info (using inner class)
    public void displayStudentInformation() {
        if (student == null) {
            System.out.println("\nNo student created yet.");
            return;
        }
        student.displayStudentInfo();
    }

    // Main method (driver code)
    public static void main(String[] args) {

        // Creating department object (outer class)
        CSEDepartment cse = new CSEDepartment(
                "CSE Department, Rajshahi University (RU)",
                "Dr. Department Head"
        );

        // Display department info
        cse.displayDepartmentDetails();

        // Take input and create student (inner class object)
        cse.createStudentFromUserInput();

        // Display student info through outer class method
        cse.displayStudentInformation();
    }
}