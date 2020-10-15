package lock.reentrantLock.thread.test4;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
        System.out.println(" 线程main停止运行");
    }
}
