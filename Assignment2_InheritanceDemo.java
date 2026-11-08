class University {
    protected String universityName;
    protected String location;
    protected int ranking;

    public University(String universityName, String location, int ranking) {
        this.universityName = universityName;
        this.location = location;
        this.ranking = ranking;
    }

    public void showUniversityInfo() {
        System.out.println("=== University Info ===");
        System.out.println("University Name: " + universityName);
        System.out.println("Location       : " + location);
        System.out.println("Ranking        : " + ranking);
    }
}
//inherit korel protected dekha jay
// Single Inheritance: CSEDepartment inherits from University
class CSEDepartment extends University {
    protected String departmentName;
    protected int totalStudents;

    public CSEDepartment(String universityName, String location, int ranking,
                         String departmentName, int totalStudents) {
        super(universityName, location, ranking);
        this.departmentName = departmentName;
        this.totalStudents = totalStudents;
    }

    public void showCSEDepartmentInfo() {
        System.out.println("=== CSE Department Info ===");
        System.out.println("Department Name: " + departmentName);
        System.out.println("Total Students : " + totalStudents);
    }
}

// Multilevel Inheritance: Faculty inherits from CSEDepartment (University -> CSEDepartment -> Faculty)
class Faculty extends CSEDepartment {
    private String facultyName;
    private String facultyRank;

    public Faculty(String universityName, String location, int ranking,
          String departmentName, int totalStudents,
                   String facultyName, String facultyRank) {
        super(universityName, location, ranking, departmentName, totalStudents);
        this.facultyName = facultyName;
        this.facultyRank = facultyRank;+
    }

    public void showFacultyInfo() {
        System.out.println("=== Faculty Info ===");
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Faculty Rank: " + facultyRank);
    }

    public void showFullProfile() {
        // Demonstrates access across multilevel inheritance chain
        showUniversityInfo();
        showCSEDepartmentInfo();
        showFacultyInfo();
    }
}

// Hierarchical Inheritance: Another department also inherits from University
class EEDepartment extends University {
    private String departmentName;
    private int labCount;

    public EEDepartment(String universityName, String location, int ranking,
                        String departmentName, int labCount) {
        super(universityName, location, ranking);
        this.departmentName = departmentName;
        this.labCount = labCount;
    }

    public void showEEDepartmentInfo() {
        System.out.println("=== EE Department Info ===");
        System.out.println("Department Name: " + departmentName);
        System.out.println("Lab Count      : " + labCount);
    }
}

public class Assignment2_InheritanceDemo {
    public static void main(String[] args) {

        // Single inheritance example (University -> CSEDepartment)
        CSEDepartment cse = new CSEDepartment(
                "Rajshahi University (RU)", "Rajshahi, Bangladesh", 1,
                "CSE", 850
        );

        System.out.println("\n----- Single Inheritance Demo -----");
        cse.showUniversityInfo();
        cse.showCSEDepartmentInfo();

        // Multilevel inheritance example (University -> CSEDepartment -> Faculty)
        Faculty faculty = new Faculty(
                "Rajshahi University (RU)", "Rajshahi, Bangladesh", 1,
                "CSE", 850,
                "Dr. A. Rahman", "Professor"
        );

        System.out.println("\n----- Multilevel Inheritance Demo -----");
        faculty.showFullProfile();

        // Hierarchical inheritance example (University -> EEDepartment)
        EEDepartment ee = new EEDepartment(
                "Rajshahi University (RU)", "Rajshahi, Bangladesh", 1,
                "EEE", 12
        );

        System.out.println("\n----- Hierarchical Inheritance Demo -----");
        ee.showUniversityInfo();
        ee.showEEDepartmentInfo();
    }
}
