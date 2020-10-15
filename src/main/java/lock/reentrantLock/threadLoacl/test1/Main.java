package lock.reentrantLock.threadLoacl.test1;

/**
 * 验证ThreadLocal类在各线程中间的隔离性
 *
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();
        ThreadA threadA = new ThreadA();
        threadA.start();
        for(int i=0;i<100;i++){
            ThreadLocalTest.set("main "+ (i+1));
            System.out.println("main get value " +ThreadLocalTest.get());
            Thread.sleep(1000);
        }
    }
}
