package lock.reentrantLock.thread.test3;

public class ThreadB extends  Thread {

    private Ref ref;

    public ThreadB(Ref ref){
        this.ref=ref;
    }

    @Override
    public void run() {

        ref.setName("b");
    }
}
