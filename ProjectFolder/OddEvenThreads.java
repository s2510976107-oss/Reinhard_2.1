class OddThread extends Thread {
    private final int limit;

    public OddThread(int limit) {
        this.limit = limit;
    }

    
    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class EvenThread extends Thread {
    private final int limit;

    public EvenThread(int limit) {
        this.limit = limit;
    }

    
    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

public class OddEvenThreads {
    public static void main(String[] args) {
        int limit = 20; // change as needed

        Thread odd = new OddThread(limit);
        Thread even = new EvenThread(limit);

        odd.start(); // start thread 1
        even.start(); // start thread 2
    }
}