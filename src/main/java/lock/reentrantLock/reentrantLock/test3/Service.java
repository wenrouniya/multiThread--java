package lock.reentrantLock.reentrantLock.test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

    private ReentrantLock lock =new ReentrantLock();
    private Condition condition = lock.newCondition();
    private volatile boolean flag=true;


    public void set() throws InterruptedException {
        lock.lock();
        while( flag){
            condition.await();
        }
        System.out.println("***");
        flag=!flag;
        condition.signal();
        lock.unlock();
    }

    public void get() throws InterruptedException {
        lock.lock();
        while(!flag){
            condition.await();
        }

        System.out.println("@@@");
        flag =!flag;
        condition.signal();
        lock.unlock();

    }

}
