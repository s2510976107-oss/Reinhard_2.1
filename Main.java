// Assignment 5: Abstract Class
// Demonstrates an abstract class Department and concrete subclasses.

abstract class Department {
    // Abstract method: must be implemented by subclasses
    public abstract void conductResearch();
}

class CSEDepartment extends Department {
    @Override
    public void conductResearch() {
        System.out.println("CSE Department: Conducting research in AI, Machine Learning, and Software Engineering.");
    }
}

class EEDepartment extends Department {
    @Override
    public void conductResearch() {
        System.out.println("EE Department: Conducting research in Power Systems, Electronics, and Communication.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Cannot do: Department d = new Department();  // because Department is abstract

        Department cse = new CSEDepartment();
        Department ee = new EEDepartment();

        // Demonstrate polymorphism: same method call, different behavior
        cse.conductResearch();
        ee.conductResearch();
    }
}
