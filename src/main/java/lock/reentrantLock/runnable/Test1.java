package lock.reentrantLock.runnable;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable1());
        thread.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" is running ");
        }
    }
}
