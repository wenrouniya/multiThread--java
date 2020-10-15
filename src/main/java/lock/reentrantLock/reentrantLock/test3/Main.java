package lock.reentrantLock.reentrantLock.test3;

/**
 * 线程交替打印
 *
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
