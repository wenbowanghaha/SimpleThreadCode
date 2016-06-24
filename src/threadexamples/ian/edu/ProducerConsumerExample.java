package threadexamples.ian.edu;

/**
 * Created by Ian Gortan on 6/20/2016.
 */
public class ProducerConsumerExample {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        (new Thread(new Consumer(buffer))).start();
        (new Thread(new Producer(buffer))).start();

    }
}
