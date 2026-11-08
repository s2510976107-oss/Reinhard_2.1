import MyPackage.Teacher;
import MyPackage.Course;

public class MainApp {
    public static void main(String[] args) {

        // Create Teacher object (from package)
        Teacher t1 = new Teacher("Musa Sir", "Computer Science", 7);

        // Create Course object (from package) and assign teacher
        Course c1 = new Course("CS101", "Introduction to Programming", 3, t1);

        // Display information
        System.out.println("=== Teacher Information ===");
        t1.displayTeacherInfo();

        System.out.println("\n=== Course Information ===");
        c1.displayCourseInfo();
    }
}
