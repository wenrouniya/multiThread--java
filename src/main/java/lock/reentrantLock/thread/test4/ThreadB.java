package lock.reentrantLock.thread.test4;

public class ThreadB extends  Thread {
    private  Service service;
    public  ThreadB(Service service)
    {
        this.service=service;
    }
    @Override
    public void run() {
        super.run();
        service.stopMethod();
    }
}
