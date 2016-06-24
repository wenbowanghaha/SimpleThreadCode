package threadexamples.ian.edu;

/**
 * Created by Ian Gortan on 6/23/2016.
 */
public class BoundedBuffer {
    // Bounded message buffer between producer to consumer.
    private String messages[];
    final private int CAPACITY;
    private int front, back = 0;
    // True if consumer must wait for producer to send message,
    // false if producer must wait for consumer to retrieve message.
    private boolean empty = true;
    private int numItems = 0;

    public BoundedBuffer (int size) {
        CAPACITY = size;
        messages = new String [CAPACITY];
    }

    public synchronized String retrieve() {
        // Wait until message is available.
        while (numItems == 0) {
            try {
                System.out.println("Waiting for a message");
                wait();
            } catch (InterruptedException e) {}
        }
        // Toggle status.
        numItems--;
        // Notify producer that buffer is empty
        notifyAll();
        String msg = messages [back];
        back = (back + 1) % CAPACITY ;
        return msg;

    }

    public synchronized void put(String message) {
        // Wait until message has been retrieved.
        while (numItems == CAPACITY) {
            try {
                wait();
                System.out.println("Buffer is full. Waiting ....");
            } catch (InterruptedException e) {}
        }
        // Toggle status.
        numItems++;
        // Store message.
        this.messages[front] = message;
        front = (front + 1 ) % CAPACITY ;
        // Notify consumer that message is available
        notifyAll();
    }

}
