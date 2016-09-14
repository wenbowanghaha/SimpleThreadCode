package threadexamples.ian.edu;

/**
 * Created by Ian Gortan on 9/14/2016.
 */
public class NamingThread implements Runnable {

   // private Thread thr;
    private String name;
    public  NamingThread () {
       name = "Anon";
    }
    public NamingThread (String threadName) {
        //thr = new Thread (this, threadName);
        name = threadName;
        //thr.start();  // calls run

    }

    @Override
    public void run() {

        System.out.println (name + " is " + Thread.currentThread());

    }
}
