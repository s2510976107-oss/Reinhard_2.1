class StudentNamesTask implements Runnable {
    private final String[] students;

    public StudentNamesTask(String[] students) {
        this.students = students;
    }

    
    public void run() {
        for (String s : students) {
            System.out.println("Student: " + s);
            try { Thread.sleep(100); } catch (InterruptedException e) { /* ignore */ }
        }
    }
}

class CourseNamesTask implements Runnable {
    private final String[] courses;

    public CourseNamesTask(String[] courses) {
        this.courses = courses;
    }

    
    public void run() {
        for (String c : courses) {
            System.out.println("Course: " + c);
            try { Thread.sleep(100); } catch (InterruptedException e) { /* ignore */ }
        }
    }
}

public class StudentCourseThreads {
    public static void main(String[] args) {
        String[] students = {"Ali", "Sara", "John", "Ayesha", "David"};
        String[] courses = {"OOP", "DSA", "Database", "OS", "Networks"};

        // Implement Runnable + override run()
        Runnable studentTask = new StudentNamesTask(students);
        Runnable courseTask = new CourseNamesTask(courses);

        // Create Thread objects and execute them
        Thread t1 = new Thread(studentTask, "StudentThread");
        Thread t2 = new Thread(courseTask, "CourseThread");

        t1.start();
        t2.start();
    }
}
