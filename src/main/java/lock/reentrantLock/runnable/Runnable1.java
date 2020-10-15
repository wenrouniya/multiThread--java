package lock.reentrantLock.runnable;

public class Runnable1 implements  Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" is running ");
        }
    }
}
