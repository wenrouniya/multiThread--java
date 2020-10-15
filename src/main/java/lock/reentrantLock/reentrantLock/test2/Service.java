package lock.reentrantLock.reentrantLock.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {


    private ReentrantLock lock = new ReentrantLock();
    private Condition conditionA =lock.newCondition();
    private Condition conditionB =lock.newCondition();


    public void waitA(){
        lock.lock();
        System.out.println("A线程的wait时间为" + System.currentTimeMillis());
        try {
            conditionA.await();
            System.out.println("A线程被唤醒的时间为" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public void waitB(){
        lock.lock();
        System.out.println("B线程的wait时间为" + System.currentTimeMillis());
        try {
            conditionB.await();
            System.out.println("B线程被唤醒的时间为" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public  void signalA(){

        lock.lock();
        System.out.println("A线程的signal时间为"+ System.currentTimeMillis());
        conditionA.signalAll();
        lock.unlock();
    }

    public  void signalB(){

        lock.lock();
        System.out.println("B线程的signal时间为"+System.currentTimeMillis());
        conditionB.signalAll();
        lock.unlock();
    }


}
