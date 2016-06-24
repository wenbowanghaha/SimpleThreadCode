package threadexamples.ian.edu;

import java.util.Random;

/**
 * Created by Ian Gortan on 6/23/2016.
 */
public class ProducerBounded implements Runnable {
    private BoundedBuffer buffer;

    public ProducerBounded(BoundedBuffer buf) {
        this.buffer = buf;
    }

    public void run() {
        String importantInfo[] = {
                "Mourihno is an idiot",
                "Pep is a genuis",
                "City Rule!!",
                "United Scum!!!!"
        };
        Random random = new Random();

        for (int i = 0; i < importantInfo.length; i++) {
            for (int j = 0; j < importantInfo.length; j++) {
                buffer.put(importantInfo[i]);
            }
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {}
        }
        buffer.put("DONE");
    }
}
