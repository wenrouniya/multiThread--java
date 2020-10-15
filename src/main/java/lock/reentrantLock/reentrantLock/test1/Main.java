package lock.reentrantLock.reentrantLock.test1;

public class Main {


    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadA threadA1 = new ThreadA(service);
        threadA1.start();
        ThreadA threadA2 = new ThreadA(service);
        threadA2.start();
    }
}
