package threadexamples.ian.edu;

import java.util.Random;

/**
 * Created by Ian Gortan on 6/23/2016.
 */
public class ConsumerBounded implements Runnable {
    private BoundedBuffer buffer;

    public ConsumerBounded (BoundedBuffer buf) {
        this.buffer = buf;
    }

    public void run() {
        Random random = new Random();
        for (String message = buffer.retrieve(); ! message.equals("DONE"); message = buffer.retrieve()) {
            System.out.format("%s: MESSAGE RECEIVED: %s%n", Thread.currentThread().getName(), message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
            }
        }
}

