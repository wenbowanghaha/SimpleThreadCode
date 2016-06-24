package threadexamples.ian.edu;

/**
 * Created by Ian Gortan on 6/23/2016.
 */
public class BoundedBufferExample {

    public static void main(String[] args) {
        BoundedBuffer buffer = new BoundedBuffer(10);
        (new Thread(new ConsumerBounded(buffer))).start();
        (new Thread(new ProducerBounded(buffer))).start();

    }
}
