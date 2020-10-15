package lock.reentrantLock.threadLoacl.test1;

public class ThreadA extends  Thread {

    @Override
    public void run() {

        for(int i=0;i<100;i++){
            ThreadLocalTest.set("ThreadA" +(i+1));
            System.out.println("ThreadA get value "+ ThreadLocalTest.get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
