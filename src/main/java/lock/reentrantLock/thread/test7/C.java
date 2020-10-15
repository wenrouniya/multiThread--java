package lock.reentrantLock.thread.test7;

/**
 * 消费者实体类
 */
public class C {

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() throws InterruptedException {
        synchronized (lock) {
            while (ValueObject.value.equals("")) {
                System.out.println("消费者" + Thread.currentThread().getName()+"被阻塞了");
                lock.wait();
            }

            System.out.println("消费者"+ Thread.currentThread().getName()+"running中");
            ValueObject.value = "";
            lock.notify();
        }

    }
}
