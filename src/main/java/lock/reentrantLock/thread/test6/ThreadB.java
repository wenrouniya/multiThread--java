package lock.reentrantLock.thread.test6;

import java.util.ArrayList;

public class ThreadB extends Thread {

    private String lock;
    private ArrayList<Integer> list;

    public ThreadB(String lock, ArrayList<Integer> list) {
        this.list = list;
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                list.add(i);
                System.out.println("添加了" + i + "个元素");


                if (list.size() == 5) {
                    System.out.println("通知已发出");
                    lock.notify();
                }

                try {
                    //方法执行并不释放锁
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
