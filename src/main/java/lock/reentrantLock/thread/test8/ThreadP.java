package lock.reentrantLock.thread.test8;

/**
 * 生产者线程
 */
public class ThreadP extends  Thread {
    private P p;

    public ThreadP(P p){
        this.p=p;
    }

    @Override
    public void run() {

        try {
            while(true){

                p.setValue();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
