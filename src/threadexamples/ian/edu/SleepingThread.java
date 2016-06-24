package threadexamples.ian.edu;

/**
 * Created by Ian Gortan on 6/20/2016.
 */
public class SleepingThread implements Runnable {

    @Override
    public void run()   {

            String sillyMessages[] = {
                    "Mourihno is an idiot",
                    "Pep is a genuis",
                    "City Rule!!",
                    "United Scum!!!!"
            };
        System.out.println("I am awake!!!!");
            for (int i = 0; i < sillyMessages.length; i++) {
                //Pause for 2 seconds
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e) {
                    // prematurely woken up. go on to next snooze ....
                    String threadName =
                            Thread.currentThread().getName();
                    System.out.format("%s: %s%n",
                            threadName,
                            "interrupted sleep is bad for you!! I'm going to keep dozing ...");
                                 }
                //Print a message
                System.out.println(sillyMessages[i]);
            }
        }

}
