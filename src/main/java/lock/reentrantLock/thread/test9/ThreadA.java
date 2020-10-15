package lock.reentrantLock.thread.test9;

public class ThreadA extends  Thread {

    private  Tools tools;


    public  ThreadA(Tools tools){
        this.tools =tools;
    }

    @Override
    public void run() {
        super.run();
        try {
            tools.printA();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
