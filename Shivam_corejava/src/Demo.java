
import java.lang.Thread;

 class Demo extends Thread {
    public void run() {
        try {
            System.out.println("Id of each thread: " + Thread.currentThread().getId());
        } 
        catch (Exception e) 
        {
            System.out.println("Thread are not called: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            Demo obj = new Demo();
            obj.start();
        }
    }
}
