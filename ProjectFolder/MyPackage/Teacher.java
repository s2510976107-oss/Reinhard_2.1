package MyPackage;

public class Teacher {
    private String name;
    private String department;
    private int experienceYears;

    public Teacher(String name, String department, int experienceYears) {
        this.name = name;
        this.department = department;
        this.experienceYears = experienceYears;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void displayTeacherInfo() {
        System.out.println("Teacher Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Experience (years): " + experienceYears);
    }
}