package threadexamples.ian.edu;

/**
 * Created by Ian Gortan on 9/14/2016.
 */
public class ThreadStartOrderExample {

    public static void main(String arg[]) {

        Thread th1 = new Thread (new NamingThread("Pep the Great")) ;
        Thread th2 = new Thread (new NamingThread("Mourinho the tool"));
        Thread th3 = new Thread (new NamingThread()) ;

        System.out.println ("Ready to roll ...");

        th1.start();
        th2.start();
        th3.start();

        System.out.println ("main thread exiting " + Thread.currentThread());
    }
}
