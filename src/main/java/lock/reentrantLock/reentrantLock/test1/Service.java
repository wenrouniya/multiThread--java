package lock.reentrantLock.reentrantLock.test1;

import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock =new ReentrantLock();

    public void testMethos(){
        lock.lock();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+ "--- "+ i);
        }
        lock.unlock();
    }

}
