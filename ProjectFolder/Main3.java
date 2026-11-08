// Assignment 4: Interfaces and Inheritance

// 1) Create a superclass University
class University {
    protected String universityName;
    protected String location;

    public University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }

    public void showUniversityInfo() {
        System.out.println("University: " + universityName);
        System.out.println("Location  : " + location);
    }
}

// 2) Create an interface Sports
interface Sports {
    void sportName();       // what sport the department plays/represents
    void coachName();       // coach name for that sport
    void practiceSchedule(); // practice info
}

// 3) Create subclasses that inherit from University and implement Sports

class CSEDepartment extends University implements Sports {
    private String departmentName;

    public CSEDepartment(String universityName, String location) {
        super(universityName, location);
        this.departmentName = "CSE Department";
    }

    public void showDepartmentInfo() {
        System.out.println("Department: " + departmentName);
    }

    // 4) Override interface methods
    @Override //anotation ja parent mathode overwrite kre

    public void sportName() {
        System.out.println("Sport     : Programming Contest (ICPC-style)");
    }

    @Override
    public void coachName() {
        System.out.println("Coach     : Dr. Hasan");
    }

    @Override
    public void practiceSchedule() {
        System.out.println("Practice  : Sun, Tue, Thu (5:00 PM - 7:00 PM)");
    }
}

class EEDepartment extends University implements Sports {
    private String departmentName;

    public EEDepartment(String universityName, String location) {
        super(universityName, location);
        this.departmentName = "EE Department";
    }

    public void showDepartmentInfo() {
        System.out.println("Department: " + departmentName);
    }

    // 4) Override interface methods
    @Override
    public void sportName() {
        System.out.println("Sport     : Football");
    }

    @Override
    public void coachName() {
        System.out.println("Coach     : Mr. Rahim");
    }

    @Override
    public void practiceSchedule() {
        System.out.println("Practice  : Mon, Wed (4:00 PM - 6:00 PM)");
    }
}

// Driver / Test class
public class Main3 {
    public static void main(String[] args) {
        System.out.println("=== CSE Department ===");
        CSEDepartment cse = new CSEDepartment("Tech University", "Dhaka");
        cse.showUniversityInfo();   // inherited from University
        cse.showDepartmentInfo();   // subclass method
        cse.sportName();            // Sports (overridden)
        cse.coachName();            // Sports (overridden)
        cse.practiceSchedule();     // Sports (overridden)

        System.out.println("\n=== EE Department ===");
        EEDepartment ee = new EEDepartment("Tech University", "Dhaka");
        ee.showUniversityInfo();    // inherited from University
        ee.showDepartmentInfo();    // subclass method
        ee.sportName();             // Sports (overridden)
        ee.coachName();             // Sports (overridden)
        ee.practiceSchedule();      // Sports (overridden)
    }
}