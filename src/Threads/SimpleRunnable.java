package src.Threads;

import java.util.concurrent.TimeUnit;

public class SimpleRunnable implements Runnable {

    @Override
    public void run() {
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Ending simple thread");
    }

    public static void main(String[] args) {

        Runnable r= new SimpleRunnable();
        Thread th= Thread.ofPlatform()
                    .name("Simple")
                    .daemon(false)
                    .start(r);

    }
}
