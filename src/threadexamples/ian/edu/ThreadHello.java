package threadexamples.ian.edu;

public class ThreadHello implements Runnable{

   public void run() {
        System.out.println("Hello from a thread!");
   }

    public static void main(String[] args) {

        (new Thread(new ThreadHello())).start();
        java.lang.Thread sleepy = new Thread(new SleepingThread());
        sleepy.start();
        (new Thread(new ThreadHello())).start();
        sleepy.interrupt();
    }
}
