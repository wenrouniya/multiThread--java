package lock.reentrantLock.reentrantLock.test3;

public class ThreadB extends  Thread {

    private  Service service;

    public ThreadB(Service service){
        this.service =service;
    }

    @Override
    public void run() {

        for(int i=0;i< 100;i++){
            try {
                service.set();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
