package threadexamples.ian.edu;

/**
 * Created by Ian Gortan on 6/20/2016.
 */
import java.util.Random;

public class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buf) {
        this.buffer = buf;
    }

    public void run() {
        Random random = new Random();
        for (String message = buffer.retrieve();
             ! message.equals("DONE");
             message = buffer.retrieve()) {
            System.out.format("%s: MESSAGE RECEIVED: %s%n", Thread.currentThread().getName(), message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
    }
}
