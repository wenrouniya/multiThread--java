package lock.reentrantLock.thread.test4;


public class ThreadA extends Thread {
    private  Service service;

    public ThreadA(Service service){
        this.service =service;
    }

    @Override
    public void run() {
        super.run();
        service.runMethod();
    }
}
