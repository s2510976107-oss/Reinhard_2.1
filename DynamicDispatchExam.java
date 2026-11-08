class Department {
    // Superclass method
    void conductExam() {
        System.out.println("Department is conducting a general exam.");
    }
}

// Subclass 1
class CSEDepartment extends Department {
    @Override
    void conductExam() {
        System.out.println("CSE Department is conducting the Programming and Data Structures exam.");
    }
}

// Subclass 2
class EEDepartment extends Department {
    @Override
    void conductExam() {
        System.out.println("EE Department is conducting the Circuits and Power Systems exam.");
    }
}

public class DynamicDispatchExam {
    public static void main(String[] args) {

        // Superclass reference, subclass object (dynamic dispatch)
        Department dept;

        dept = new CSEDepartment(); // actual object type: CSEDepartment
        dept.conductExam();         // calls CSEDepartment's overridden method

        dept = new EEDepartment();  // actual object type: EEDepartment
        dept.conductExam();         // calls EEDepartment's overridden method
    }
}

