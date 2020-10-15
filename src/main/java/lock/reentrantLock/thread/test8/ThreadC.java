package lock.reentrantLock.thread.test8;

public class ThreadC extends  Thread {

    private C c;
    public  ThreadC(C c){
        this.c=c;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (true){
                c.getValue();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
