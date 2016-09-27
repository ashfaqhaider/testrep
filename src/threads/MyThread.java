package threads;

/**
 * Created by Ashfaq Haider on 2016-09-18.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new Thread(new MyThread()).start();
    }
}
