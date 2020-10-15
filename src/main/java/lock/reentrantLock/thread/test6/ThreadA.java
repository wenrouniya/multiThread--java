package lock.reentrantLock.thread.test6;

import java.util.ArrayList;

public class ThreadA extends  Thread {

    private String lock;
    private ArrayList<Integer> list;

    public  ThreadA(String lock,ArrayList<Integer> list){
        this.list=list;
        this.lock=lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock){
            if(list.size()!=5){

                long start = System.currentTimeMillis();
                System.out.println("wait begin "+ start);

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                long end= System.currentTimeMillis();
                System.out.println("wait end "+ end );
                System.out.println("总共用时 "+(end-start ));
            }
        }
    }
}
