package threadexamples.ian.edu;

/**
 * Created by Ian Gortan on 9/14/2016.
 */
public class NamingThread implements Runnable {

    private String name;
    public  NamingThread () {
       name = "Anon";
    }
    public NamingThread (String threadName) {
        name = threadName;

    }
    @Override
    public void run() {
        System.out.println (name + " is " + Thread.currentThread());
    }
}
