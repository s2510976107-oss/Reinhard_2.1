package MyPackage;

public class Course {
    private String courseCode;
    private String courseTitle;
    private int creditHours;
    private Teacher teacher; // linking course to a teacher

    public Course(String courseCode, String courseTitle, int creditHours, Teacher teacher) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.teacher = teacher;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void displayCourseInfo() {
        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Assigned To : " + teacher.getName());
    }
}
