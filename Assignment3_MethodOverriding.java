// Assignment 3: Method Overriding (Java)

class Department {
    protected String universityName;
    protected String departmentName;

    public Department(String universityName, String departmentName) {
        this.universityName = universityName;
        this.departmentName = departmentName;
    }

    // Superclass method (will be overridden)
    public void displayDepartmentInfo() {
        System.out.println("=== Department Info (General) ===");
        System.out.println("University : " + universityName);
        System.out.println("Department : " + departmentName);
        System.out.println("Info       : This is a general department in the university.");
    }
}

class CSEDepartment extends Department {
    private int totalStudents;
    private String labName;

    public CSEDepartment(String universityName, int totalStudents, String labName) {
        super(universityName, "CSE");
        this.totalStudents = totalStudents;
        this.labName = labName;
    }

    // Overriding the superclass method
    @Override
    public void displayDepartmentInfo() {
        System.out.println("=== Department Info (CSE - Overridden) ===");
        System.out.println("University     : " + universityName);
        System.out.println("Department     : " + departmentName);
        System.out.println("Total Students : " + totalStudents);
        System.out.println("Main Lab       : " + labName);
        System.out.println("Focus          : Programming, Algorithms, AI, Software Engineering.");
    }
}

class EEDepartment extends Department {
    private int totalLabs;
    private String specialization;

    public EEDepartment(String universityName, int totalLabs, String specialization) {
        super(universityName, "EE");
        this.totalLabs = totalLabs;
        this.specialization = specialization;
    }

    // Overriding the superclass method
    @Override
    public void displayDepartmentInfo() {
        System.out.println("=== Department Info (EE - Overridden) ===");
        System.out.println("University     : " + universityName);
        System.out.println("Department     : " + departmentName);
        System.out.println("Total Labs     : " + totalLabs);
        System.out.println("Specialization : " + specialization);
        System.out.println("Focus          : Circuits, Power Systems, Electronics, Control Systems.");
    }
}

public class Assignment3_MethodOverriding {
    public static void main(String[] args) {

        // General department (base class)
        Department general = new Department("Rajshahi University (RU)", "General Dept");
        System.out.println("----- Base Class Method Call -----");
        general.displayDepartmentInfo();

        // Overridden method calls
        Department cse = new CSEDepartment("Rajshahi University (RU)", 850, "CSE Research Lab");
        Department ee  = new EEDepartment("Rajshahi University (RU)", 12, "Power & Electronics");

        System.out.println("\n----- Overriding Demo (Polymorphism) -----");
        cse.displayDepartmentInfo();  // calls CSEDepartment version
        System.out.println();
        ee.displayDepartmentInfo();   // calls EEDepartment version
    }
}
