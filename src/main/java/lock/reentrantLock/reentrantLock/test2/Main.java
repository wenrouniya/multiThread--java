package lock.reentrantLock.reentrantLock.test2;

/**
 * 根据condition唤醒指定的线程
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Service service = new Service();
        ThreadA threadA = new ThreadA(service);

        ThreadB threadB = new ThreadB(service);
        threadA.start();
        threadB.start();
        Thread.sleep(1000);
        service.signalA();
    }
}
