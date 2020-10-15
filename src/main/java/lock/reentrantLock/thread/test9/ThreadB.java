package lock.reentrantLock.thread.test9;


public class ThreadB extends  Thread {

    private Tools tools;

    public ThreadB(Tools tools){
        this.tools=tools;
    }

    @Override
    public void run() {

        try {
            tools.printB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
