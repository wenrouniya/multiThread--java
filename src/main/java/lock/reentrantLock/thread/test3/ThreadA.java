package lock.reentrantLock.thread.test3;

public class ThreadA extends  Thread {

    private Ref ref;
    public  ThreadA(Ref ref){
        this.ref=ref;
    }

    @Override
    public void run() {

        ref.setName("a");
    }
}
