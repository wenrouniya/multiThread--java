package lock.reentrantLock.threadLoacl.test1;

public class ThreadB extends  Thread {


    @Override
    public void run() {

        for(int i=0;i<100;i++){
            ThreadLocalTest.set("ThreadB" +(i+1));
            System.out.println("ThreadB get value "+ ThreadLocalTest.get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
