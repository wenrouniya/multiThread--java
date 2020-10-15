package lock.reentrantLock.thread;

public class Test2 {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+" is running ");
        thread.setName("xixiix");
        System.out.println(thread.getName()+" is running ");

    }
}
