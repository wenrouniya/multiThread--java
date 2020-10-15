package lock.reentrantLock.thread.test8;

/**
 * 生产者
 */
public class P {

    private String  lock;
    public  P(String lock){
        this.lock=lock;
    }

    public void setValue() throws InterruptedException {
        synchronized (lock){
            while (!ValueObject.value.equals("")){
                System.out.println("生产着" + Thread.currentThread().getName()+"阻塞了");
                lock.wait();
            }
            System.out.println("生产者" + Thread.currentThread().getName()+"running了");
            ValueObject.value="pp";
            lock.notifyAll();
        }
    }
}
