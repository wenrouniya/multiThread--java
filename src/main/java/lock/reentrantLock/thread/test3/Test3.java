package lock.reentrantLock.thread.test3;

public class Test3 {

    public static void main(String[] args) {
        Ref ref = new Ref();
        ThreadA threadA = new ThreadA(ref);
        ThreadB threadB = new ThreadB(ref);
        threadA.start();
        threadB.start();
    }
}
