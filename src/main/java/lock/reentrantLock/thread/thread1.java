package lock.reentrantLock.thread;

import java.util.Random;

public class thread1 extends  Thread {
    public void  run(){

        for(int i=0;i<10;i++){

            int  random =(int) Math.random();
            try {
                Thread.sleep(random);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" is running");

        }

    }
}
