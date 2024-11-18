
import java.time.Duration;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            int i = 0;
            while (true) {
                System.out.println("Thread2 : " + i);
                i++;
                Thread.sleep(Duration.ofSeconds(1).toMillis());
            }
        } catch (InterruptedException e) {
            System.out.println("Exception in Thread1");
        }

    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            int i = 0;
            while (true) {
                System.out.println("Thread1 : " + i);
                i++;
                Thread.sleep(Duration.ofSeconds(1).toMillis());
            }
        } catch (InterruptedException e) {
            System.out.println("Exception in Thread1");
        }

    }
}

public class MultithreadingJava {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        thread1.start();
        MyRunnable mr = new MyRunnable();
        Thread thread2 = new Thread(mr);
        thread2.start();
        int i = 0;
        while (true) {
            System.out.println("Thread3 : " + i);
            Thread.sleep(Duration.ofSeconds(1).toMillis());
            i++;
        }
    }
}
