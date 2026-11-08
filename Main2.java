// Assignment 3: Interface Implementation

// 1) Create an interface named Research
interface Research {
    // 2) Add a method: conductResearch()
    void conductResearch();
}

// 3) Implement the interface in: CSEDepartment
class CSEDepartment implements Research {
    @Override
    public void conductResearch() {
        System.out.println("CSE Department Research: AI, Machine Learning, Cybersecurity, Software Engineering.");
    }
}

// 3) Implement the interface in: EEDepartment
class EEDepartment implements Research {
    @Override
    public void conductResearch() {
        System.out.println("EE Department Research: Power Systems, Embedded Systems, VLSI, Communication Networks.");
    }
}

// Driver class to demonstrate interface-based polymorphism
public class Main2 {
    public static void main(String[] args) {

        // Interface-based polymorphism:
        // A Research reference can point to different implementing classes.
        Research dept1 = new CSEDepartment();
        Research dept2 = new EEDepartment();

        // 4) Display department research activities
        dept1.conductResearch();
        dept2.conductResearch();
    }
}