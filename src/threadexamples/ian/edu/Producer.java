package threadexamples.ian.edu;

/**
 * Created by Ian Gortan on 6/20/2016.
 */
import java.util.Random;

public class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buf) {
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

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            buffer.put(importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {}
        }
        buffer.put("DONE");
    }
}
